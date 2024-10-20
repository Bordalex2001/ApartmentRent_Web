package com.rentalapp.models;

public class User {
	private int id;
	private String userName;
	private String email;
	private String password;
	private String role;
	private float rating;

	public User(int id, String userName, String email, String password, String role, float rating) {
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
}