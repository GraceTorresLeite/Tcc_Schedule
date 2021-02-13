package com.tcc.domain.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@MappedSuperclass
public class Person extends BaseEntity{
	
	@Column(name = "first_name")
	@NotEmpty
	private String firstName;

	@Column(name = "last_name")
	@NotEmpty
	private String lastName;
	
	@Email
	@NotEmpty
	private String email;
	
	@Digits(fraction = 0, integer = 11)
	@NotEmpty
	private String phone;

	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
