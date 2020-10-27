package com.tcc.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.domain.model.ServiceType;
import com.tcc.domain.repository.ServiceTypeRepository;

@Service
public class ServiceTypeService {
	@Autowired
	private ServiceTypeRepository serviceTypeRepository;
	
	public ServiceType create(ServiceType serviceType) {
		return serviceTypeRepository.save(serviceType);
		
	}

}
