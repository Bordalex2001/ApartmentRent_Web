package com.rentalapp.models;

public class Admin extends User {
	private int id;

	public Admin(int id, int userId, String userName, String email, String password, String role, float rating) {
		super(userId, userName, email, password, role, rating);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}