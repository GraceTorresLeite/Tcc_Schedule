package com.tcc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.domain.model.Schedule;
import com.tcc.domain.service.ScheduleService;

@RestController
@RequestMapping("/shedule-new")
public class ScheduleController {
	
	@Autowired
	private ScheduleService scheduleService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Schedule createSchedule(@RequestBody Schedule schedule) {
		return scheduleService.saveSchedule(schedule);
		
	}

}
