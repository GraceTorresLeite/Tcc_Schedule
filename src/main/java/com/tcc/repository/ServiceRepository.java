package com.tcc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcc.domain.model.Service;

public interface ServiceRepository extends CrudRepository<Service, Long>{
	
	List<Service> findAll();

}
