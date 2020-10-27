package com.tcc.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.domain.exception.NegocioException;
import com.tcc.domain.model.Client;
import com.tcc.domain.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public Client save(Client client) {
		Client existEmail = clientRepository.findByEmail(client.getEmail());
		if(existEmail != null && !existEmail.equals(client)) {
			throw new NegocioException("Já existe um cliente com este e-mail");
		}
		return clientRepository.save(client);
	}
	
	public void delete(Long clientId) {
		 clientRepository.deleteById(clientId);
	}

}
