package com.tcc.domain.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


@Entity
public class Address extends BaseEntity{
	
	
	@MapsId
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "client_id")
	private Client client;

	private String name;
	private String number;
	private String complement;
	private String neighborhood;
	private String city;


	public Address() {
		super();
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getComplement() {
		return complement;
	}


	public void setComplement(String complement) {
		this.complement = complement;
	}


	public String getNeighborhood() {
		return neighborhood;
	}


	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	
}
