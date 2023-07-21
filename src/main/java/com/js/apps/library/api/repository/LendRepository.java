package com.js.apps.library.api.repository;

import com.js.apps.library.api.model.Book;
import com.js.apps.library.api.model.Lend;
import com.js.apps.library.api.model.LendStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LendRepository extends MongoRepository<Lend, String> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
