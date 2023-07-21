package com.js.apps.library.api.repository;

import com.js.apps.library.api.model.Author;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String>{
}
