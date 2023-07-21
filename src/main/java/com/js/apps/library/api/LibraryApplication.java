package com.js.apps.library.api;

import com.js.apps.library.api.repository.AuthorRepository;
import com.js.apps.library.api.repository.BookRepository;
import com.js.apps.library.api.repository.LendRepository;
import com.js.apps.library.api.repository.MemberRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibraryApplication {

    final AuthorRepository authorRepository;

    final BookRepository bookRepository;

    final LendRepository lendRepository;

    final MemberRepository memberRepository;

    public LibraryApplication(AuthorRepository authorRepository, BookRepository bookRepository, LendRepository lendRepository, MemberRepository memberRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.lendRepository = lendRepository;
        this.memberRepository = memberRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

}
