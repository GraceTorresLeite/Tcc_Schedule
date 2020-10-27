package com.tcc.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.domain.model.ServiceType;
import com.tcc.domain.service.ServiceTypeService;

@RestController
@RequestMapping("/service-type")
public class ServiceTypeController {
	
	@Autowired
	private ServiceTypeService serviceTypeService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ServiceType createType(@RequestBody ServiceType serviceType) {
		return serviceTypeService.create(serviceType);
	}

}
