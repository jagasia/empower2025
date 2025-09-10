package com.empower.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empower.demo.entity.Book;
import com.empower.demo.exceptions.BookAlreadyExistException;
import com.empower.demo.service.BookNotFoundException;
import com.empower.demo.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin(origins = {"*"})
public class BookController {
	@Autowired
	private BookService bs;
	
	@PostMapping
	public Book create(@RequestBody Book book) throws BookAlreadyExistException, BookNotFoundException {
		return bs.create(book);
	}
	
	@GetMapping
	public List<Book> read() {
		return bs.read();
	}
	
	@GetMapping("/{id}")
	public Book read(@PathVariable Integer id) throws BookNotFoundException {
		return bs.read(id);
	}
	
	@PutMapping("/{id}")
	public Book update(@PathVariable Integer id, @RequestBody Book book) throws BookNotFoundException {
		return bs.update(book);
	}
	
	@DeleteMapping("/{id}")
	public Book delete(@PathVariable Integer id) throws BookNotFoundException {
		return bs.delete(id);
	}
}
