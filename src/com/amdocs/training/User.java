package com.amdocs.training;

import java.sql.Date;

public class User {
	private int id;
	private String name;
	private long phone;
	private String email;
	private String address;
	private Date registrationDate;
	
	private String password;
	private String uploadPhoto;
	
	
	public User( String name, long phone, String email, String address, Date registrationDate, String password,
			String uploadPhoto) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.registrationDate = registrationDate;
		this.password = password;
		this.uploadPhoto = uploadPhoto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = Date.valueOf(registrationDate);
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUploadPhoto() {
		return uploadPhoto;
	}
	public void setUploadPhoto(String uploadPhoto) {
		this.uploadPhoto = uploadPhoto;
	}
	
	public User()
	{
		
	}
	
}
