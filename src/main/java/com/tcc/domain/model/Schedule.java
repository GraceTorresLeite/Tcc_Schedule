package com.tcc.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Schedule extends BaseEntity{
	
	
	@Column(name="client_id")
	private Client client;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "schedule")
	@Column(name="service_type_id")
	private List<ServiceType> serviceType;
	
	@Future
	@NotNull
	@Column(name = "schedule_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime scheduleDate;
	
	@Enumerated(EnumType.STRING)
	@Column(name="status_schedule")
	private StatusSchedule statusSchedule;
	

	@Column(name = "description")
	private String description;
	
	public Schedule() {
		this.statusSchedule = statusSchedule.ABERTO;
		this.scheduleDate = LocalDateTime.of(null, null);
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

	public LocalDateTime getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(LocalDateTime scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public StatusSchedule getStatusSchedule() {
		return statusSchedule;
	}

	public void setStatusSchedule(StatusSchedule statusSchedule) {
		this.statusSchedule = statusSchedule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
