package p;

import java.util.Date;

public class Book {
	
	public Book()
	{
		
	}
	
	private int id;
	private String title;
	private String author;
	private String description;
	private Date publishedDate;
	 public Book(
		        Integer id, String title,
		        String author, String description,Date publishedDate)
		    {
		  
		        super();
		  
		        this.id = id;
		  
		        this.title = title;
		  
		        this.author = author;
		  
		        this.description = description;
		        this.publishedDate = publishedDate;
		  
		           
		    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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

	
	

}
