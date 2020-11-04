package com.tcc.domain.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Client extends Person{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(mappedBy = "client", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY, optional = true)
	private Address address;
	
	@Transient
	private Set<Schedule> schedule = new LinkedHashSet<>();
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}
	
	public void addSchedule(Schedule schedule) {
		if(this.schedule == null) {
			this.schedule = new HashSet<>(); 
			this.schedule.add(schedule);
			schedule.setClient(this);
		}
	}


}
