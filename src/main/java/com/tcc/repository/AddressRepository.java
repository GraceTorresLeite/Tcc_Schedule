package com.tcc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcc.domain.model.Address;

public interface AddressRepository extends CrudRepository<Address, Long>{
	
	List<Address> findAll();
	

}
