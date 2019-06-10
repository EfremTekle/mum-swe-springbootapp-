package edu.mum.cs.cs425.eLibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.mum.cs.cs425.eLibrary.model.Book;
import edu.mum.cs.cs425.eLibrary.service.Bookservice;

@Controller
public class Bookcontroller {
	@Autowired
	private Bookservice bookservice;
	
	@GetMapping(value= {"/","/elibrary-web","/elibrary-web/home"})
	public String viewHomePage(Model model) {
	    List<Book> bookList = bookservice.getBooks();
	    model.addAttribute("bookList",  bookList);
	    
	    return "home/index1";
	}
	
	@GetMapping(value="/new")
	public String insertNewBookForm(Model model) {
	    Book book = new Book();
	    model.addAttribute("book", book);
	     
	    return "home/newbookform";
	}
	@PostMapping(value = "/save")
	public String saveProduct(@ModelAttribute("book") Book book) {
	    bookservice.saveBook(book);
	     
	    return "redirect:/";
	}
	}


