package com.sample.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sample.book.model.Book;

public interface BookRepository extends MongoRepository<Book, String>{
	
}