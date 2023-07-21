package com.js.apps.library.api.repository;

import com.js.apps.library.api.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface BookRepository extends MongoRepository<Book, String>  {
    Optional<Book> findByIsbn(String isbn);
}
