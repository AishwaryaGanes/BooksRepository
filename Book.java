package com.springrest.springrest.entities;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

public class Book {
	
	private int id;
	@NotNull
	private String title;
	@NotNull
	private String author;
	private String description;
	@Past
	private Date publishedDate;
		
	public Book(int id, String title, String author, String description, Date publishedDate) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.description = description;
		this.publishedDate = publishedDate;
	}


	public Book() {
		super();
		// TODO Auto-generated constructor stub
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


	public Date getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", publishedDate=" + publishedDate + "]";
	}


	
	
	

}
