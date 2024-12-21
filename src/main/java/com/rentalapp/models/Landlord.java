package com.rentalapp.models;

import java.util.List;

public class Landlord extends User {
	private Long id;
	private List<Property> properties;

	public Landlord() {
		super();
	}

	public Landlord(Long id, List<Property> properties, Long userId, String firstName, String lastName,
			String email, String password, UserRole role, float rating) {
		super(userId, firstName, lastName, email, password, role, rating);
		this.id = id;
		this.properties = properties;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Property> getProperties() {
		return properties;
	}

	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}
}