package com.rentalapp.models;

public class PropertyImage {
	private int id;
	private int propertyId;
	private String imageUrl;
	
	public PropertyImage(int id, int propertyId, String imageUrl) {
		this.id = id;
		this.propertyId = propertyId;
		this.imageUrl = imageUrl;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
