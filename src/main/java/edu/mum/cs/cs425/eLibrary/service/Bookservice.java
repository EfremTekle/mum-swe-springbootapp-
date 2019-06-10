package edu.mum.cs.cs425.eLibrary.service;

import java.util.List;

import edu.mum.cs.cs425.eLibrary.model.Book;

public interface Bookservice {
	public List<Book> getBooks();
	public void saveBook(Book book);
	public Book getBook(long id) ;


}
