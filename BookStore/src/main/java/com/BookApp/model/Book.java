package com.BookApp.model;

public class Book {
	
	private int id;
	private	String author;
	private String name;
	private int year;
	private int type;
	
	public Book() {
	}
	
	
    public Book( String author, String name, int year, int type) {
		//this.id = id;
		this.author = author;
		this.name = name;
		this.year = year;
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	
	
}
