package com.tcc.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Schedule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Client client;
	
	@OneToMany
	private List<ServiceType> serviceType;
	
	private BigDecimal total;
	
	@Enumerated(EnumType.STRING)
	private StatusSchedule statusSchedule;
	
	private LocalDateTime dateSchedule;
	
	
	public Schedule() {
		this.statusSchedule = statusSchedule.ABERTO;
		this.dateSchedule = LocalDateTime.now();
	}



	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<ServiceType> getServiceType() {
		return serviceType;
	}
	public void setServiceType(List<ServiceType> serviceType) {
		this.serviceType = serviceType;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public StatusSchedule getStatusSchedule() {
		return statusSchedule;
	}
	public void setStatusSchedule(StatusSchedule statusSchedule) {
		this.statusSchedule = statusSchedule;
	}
	public LocalDateTime getDateSchedule() {
		return dateSchedule;
	}
	public void setDateSchedule(LocalDateTime dateSchedule) {
		this.dateSchedule = dateSchedule;
	}
	
	

}
