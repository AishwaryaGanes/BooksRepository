package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Book;

@Service
public class BookServiceImpl implements BookService {
	
	List<Book> list;
	
	public BookServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new Book(123,"Half girlfriend","Chetan Bhagat","abc",new Date("2022-9-12")));
	}

	@Override
	public List<Book> getBooks() {
		return list;
	}

	@Override
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

}
