package com.tcc.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcc.domain.model.Client;

@Repository
public interface ClientRepository  extends JpaRepository<Client, Long>{

	List<Client> findAll();
	
	List<Client> findByName(String name);
	
	List<Client> findByNameContaining(String name);

}
