package edu.mum.cs.cs425.eLibrary.serviceImp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.eLibrary.Bookrepository.Bookrepository;
import edu.mum.cs.cs425.eLibrary.model.Book;
import edu.mum.cs.cs425.eLibrary.service.Bookservice;
@Service
@Transactional
public class BookserviceImp implements Bookservice {

	@Autowired
	private Bookrepository repo;

	public List<Book> getBooks() {
		return repo.findAll();
	}

	public void saveBook(Book book) {
		repo.save(book);
	}

	public Book getBook(long id) {
		return repo.findById(id).get();
	}

	
		
	}


