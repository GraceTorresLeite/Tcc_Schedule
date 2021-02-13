package com.tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.domain.model.ServiceType;

@Repository
public interface ServiceTypeRepository extends JpaRepository<ServiceType, Long>{

	
}
