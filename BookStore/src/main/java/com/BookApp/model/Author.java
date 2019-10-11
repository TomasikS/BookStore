package com.BookApp.model;

public class Author {

	private int id;
	private String firstname;
	private String lastname;
	private Book book;

	public Author(int id, String firstname, String lastname, Book book) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.book = book;
	}

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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
