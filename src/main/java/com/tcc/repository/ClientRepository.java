package com.tcc.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tcc.domain.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {
	
	Client findBy();
	
	List<Client> findAll();
	
	Client save();
	
	void delete(Client client);
	
	void update();

}
