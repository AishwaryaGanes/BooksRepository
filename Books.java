package p;

import java.util.ArrayList;
import java.util.List;

public class Books {
	
	//private List<Employee> getEmployeeList();
	 private List<Book> bookList;
	  
	    // Method to return the list
	    // of employees
	    public List<Book> getBookList()
	    {
	  
	        if (bookList == null) {
	  
	        	bookList
	                = new ArrayList<>();
	  
	                   
	        }
	  
	        return bookList;
	  
	           
	    }
	  
	    public void
	    setEmployeeList(
	        List<Book> bookList)
	    {
	        this.bookList
	            = bookList;
	    }

}
