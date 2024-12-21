package com.rentalapp.models;

import java.util.List;

public class Tenant extends User {
	private Long id;
	private List<Booking> bookings;

	public Tenant(Long id, List<Booking> bookings, Long userId, String firstName, String lastName, String email,
			String password, UserRole role, float rating) {
		super(userId, firstName, lastName, email, password, role, rating);
		this.id = id;
		this.bookings = bookings;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
}