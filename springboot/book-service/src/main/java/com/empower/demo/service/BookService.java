package com.empower.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empower.demo.entity.Book;
import com.empower.demo.exceptions.BookAlreadyExistException;
import com.empower.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository br;
	
	public Book create(Book book) throws BookAlreadyExistException, BookNotFoundException {
		//check if book already exists
		Book b=null;
		if(book.getId()==null) {
			b=br.save(book);
		}else if(read(book.getId())!=null){
			throw new BookAlreadyExistException("Book already exists for id:"+book.getId());
		}
		return b; 
	}
	
	public List<Book> read() {
		return br.findAll();
	}
	public Book read(Integer id) throws BookNotFoundException {
		Optional<Book> temp = br.findById(id);
		Book book=null;
		if(temp.isPresent()) {
			book=temp.get();
		}else {
			throw new BookNotFoundException("No book found for id:"+id);
		}
		return book;
	}
	public Book update(Book book) throws BookNotFoundException {
		Book b = read(book.getId());
		if(b!=null) {
			b=book;
			br.save(b);
		}
		return b;
	}
	public Book delete(Integer id) throws BookNotFoundException {
		Book book = read(id);
		if(book!=null) {
			br.delete(book);
		}
		return book;
	}
	
}
