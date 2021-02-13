package com.tcc.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcc.domain.model.Address;
import com.tcc.domain.model.Client;
import com.tcc.domain.repository.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	
	public Address create(Client client) {
		Address address = new Address();
		address.setClient(client);
		address.setName(client.getAddress().getName());
		address.setNumber(client.getAddress().getNumber());
		address.setComplement(client.getAddress().getComplement());
		address.setNeighborhood(client.getAddress().getNeighborhood());
		address.setCity(client.getAddress().getCity());
		return addressRepository.save(address);
	}
	
}
