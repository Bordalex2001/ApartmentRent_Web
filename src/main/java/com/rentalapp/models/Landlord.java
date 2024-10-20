package com.rentalapp.models;

import java.util.LinkedList;

public class Landlord extends User {
	private int id;
	private LinkedList<Property> properties;
	
	public Landlord(int id, LinkedList<Property> properties, int userId, String userName, String email, String password,
			String role, float rating) {
		super(userId, userName, email, password, role, rating);
		this.id = id;
		this.properties = properties;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedList<Property> getProperties() {
		return properties;
	}

	public void setProperties(LinkedList<Property> properties) {
		this.properties = properties;
	}
}
