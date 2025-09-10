package com.empower.demo.service;

public class BookNotFoundException extends Exception {
	public BookNotFoundException(String message) {
		super(message);
	}
}
