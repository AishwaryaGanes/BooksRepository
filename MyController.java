package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Book;
import com.springrest.springrest.services.BookService;

@RestController
public class MyController {
@Autowired	
private BookService bookService;
	
@GetMapping("/home")
public String home()
{
	return "this is home page";
}

//get the books

@GetMapping("/books")
public List<Book> getBooks()
{
	return this.bookService.getBooks();
}

@PostMapping(path="books")
  public Book addBook(@RequestBody Book book) { 
	  return this.bookService.addBook(book); }
 
}
