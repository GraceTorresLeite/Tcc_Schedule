package com.tcc.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.tcc.domain.exception.NegocioException;
import com.tcc.domain.model.Address;
import com.tcc.domain.model.Client;
import com.tcc.domain.repository.AddressRepository;
import com.tcc.domain.repository.ClientRepository;

@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AddressService addressService;
	
	
	public List<Client> listClient(){
		return clientRepository.findAll();
	}
	
	public ResponseEntity<Client> getClient(Integer clientId) {
		Optional<Client> clientOpt = clientRepository.findById(clientId);
		
		if(clientOpt.isPresent()) {
			return ResponseEntity.ok(clientOpt.get());
		}
		return ResponseEntity.notFound().build();
	}
	
	public Client save(Client client) {
		Client existEmail = clientRepository.findByEmail(client.getEmail());
		if(existEmail != null && !existEmail.equals(client)) {
			throw new NegocioException("Já existe um cliente com este e-mail");
		}
		Client clien = new Client();
		clien.setFirstName(client.getFirstName());
		clien.setLastName(client.getLastName());
		clien.setEmail(client.getEmail());
		clien.setPhone(client.getPhone());
		
		Address address = addressService.create(clien);
		
		clien.setAddress(address);
		clientRepository.findByAddress(clien.getId());
		
		return clientRepository.save(clien);
	}
	
	public void delete(Integer clientId) {
		 clientRepository.deleteById(clientId);
	}
	
	public ResponseEntity<Client> update(Integer clientId, Client client){
		
		if(!clientRepository.existsById(clientId)) {
			
		}
		return ResponseEntity.notFound().build();
	}
	

}
