package com.tcc.domain.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.domain.exception.NegocioException;
import com.tcc.domain.model.Schedule;
import com.tcc.domain.model.StatusSchedule;
import com.tcc.domain.repository.ScheduleRepository;

@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	public Schedule saveSchedule(Schedule schedule) {
		schedule.setDateSchedule(LocalDateTime.now());
		StatusSchedule statusSchedule = schedule.getStatusSchedule();
		List<Schedule> list = new ArrayList<>(); 
		for (Schedule schedule2 : list) {
			if(schedule2.equals(new Schedule()));
			schedule2.setStatusSchedule(statusSchedule.MARCADO);
			list.add(schedule2);
		}
		if(this.scheduleRepository.equals(schedule.getStatusSchedule().ABERTO) && this.scheduleRepository.equals(schedule.getStatusSchedule().CANCELADO)) {
			 this.scheduleRepository.save(schedule);
			 list.add(schedule);
		}
		else if(this.scheduleRepository.equals(schedule.getStatusSchedule().MARCADO)){
			throw new NegocioException("Desculpe, horário ocupado! Escolha um disponível");		 
			}
		
		return schedule;
		
	}

}
