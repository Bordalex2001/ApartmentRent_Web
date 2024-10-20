package com.rentalapp.models;

import java.util.LinkedList;

public class Tenant extends User {
	private int id;
	private LinkedList<Booking> bookings;

	public Tenant(int id, LinkedList<Booking> bookings, int userId, String userName, String email, String password,
			String role, float rating) {
		super(userId, userName, email, password, role, rating);
		this.id = id;
		this.bookings = bookings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(LinkedList<Booking> bookings) {
		this.bookings = bookings;
	}

}