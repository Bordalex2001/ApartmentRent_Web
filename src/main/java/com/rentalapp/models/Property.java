package com.rentalapp.models;

import java.util.List;

public class Property {
	private int id;
	private int landlordId;
	private String title;
	private String description;
	private float price;
	private String location;
	private String status;
	private List<PropertyImage> images;
	
	public Property(int id, int landlordId, String title, String description, float price, String location,
			String status, List<PropertyImage> images) {
		this.id = id;
		this.landlordId = landlordId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.location = location;
		this.status = status;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLandlordId() {
		return landlordId;
	}

	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<PropertyImage> getImages() {
		return images;
	}

	public void setImages(List<PropertyImage> images) {
		this.images = images;
	}
}
