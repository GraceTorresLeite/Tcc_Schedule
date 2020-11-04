package com.tcc.domain.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.domain.exception.NegocioException;
import com.tcc.domain.model.Client;
import com.tcc.domain.model.Schedule;
import com.tcc.domain.model.StatusSchedule;
import com.tcc.domain.repository.ClientRepository;
import com.tcc.domain.repository.ScheduleRepository;

@Service
public class ScheduleService {
	
	@Autowired
	private ScheduleRepository scheduleRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientService clientService;
	
	
	public Schedule saveOptionSchedule(Client client) {
		LocalDate date = null;
		LocalTime time = null;
		
		if(!client.equals(clientService.getClient(client.getId()))) {
			throw new NegocioException("Não localizamos seu cadastro, realize-o para agendar um serviço!");
		}
		client = this.clientRepository.findBy();
		Schedule schedule = new Schedule();
		schedule.setClient(client);
		schedule.setScheduleDate(LocalDateTime.of(date, time));
		for (StatusSchedule statusSchedule : schedule.getStatusSchedule().values()) {
			if(schedule.getScheduleDate() == null) {
				schedule.setStatusSchedule(statusSchedule.ABERTO);
			}
			schedule.setStatusSchedule(statusSchedule.MARCADO);
			
			if(!this.scheduleRepository.equals(statusSchedule.ABERTO)) {
				throw new NegocioException("Desculpe, horário indisponível! Escolha novamente");
			}
			
			this.scheduleRepository.save(schedule);
			
		}
		
		client.addSchedule(schedule);

		return schedule;
		
	}

}
