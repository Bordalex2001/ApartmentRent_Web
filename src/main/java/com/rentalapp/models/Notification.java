package com.rentalapp.models;

public class Notification {
	private int id;
	private int userId;
	private String message;
	private boolean isRead;
	
	public Notification(int id, int userId, String message, boolean isRead) {
		this.id = id;
		this.userId = userId;
		this.message = message;
		this.isRead = isRead;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isRead() {
		return isRead;
	}

	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}
}
