package com.BookApp.model;

public class User {
	

public User(int id, String firstname, String lastname, String role, String contact, String address) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.role = role;
	this.contact = contact;
	this.address = address;
}
private  String firstname;
private  String lastname;
private  String role;
private  String contact;
private  String address;
private int id;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

	
}
