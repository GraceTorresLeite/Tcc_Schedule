package com.tcc.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.domain.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{
	
	

}
