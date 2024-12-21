package com.rentalapp.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin extends User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private Long id;
	
	@Column(name="AccessLevel", insertable=false, updatable=false)
	private String accessLevel;
	
	@Column(name="Permissions", insertable=false, updatable=false)
	private String permissions;

	public Admin() {
		super();
	}

	public Admin(Long id, String accessLevel, String permissions, Long userId, String firstName, String lastName, String email, String password, float rating) {
		super(userId, firstName, lastName, email, password, UserRole.ADMIN, rating);
		this.id = id;
		this.accessLevel = accessLevel;
		this.permissions = permissions;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
}