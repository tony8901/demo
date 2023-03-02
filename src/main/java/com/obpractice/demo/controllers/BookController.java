package com.obpractice.demo.controllers;

import com.obpractice.demo.entities.Book;
import com.obpractice.demo.repositories.BookRepository;
import com.obpractice.demo.services.BookService;
import org.hibernate.annotations.CompositeTypeRegistrations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;
    private final BookRepository bookRepository;

    public BookController(BookService bookService,
                          BookRepository bookRepository) {
        this.bookService = bookService;
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public ResponseEntity<List<Book>> findAll(){
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> findById(@PathVariable Long id){
        return bookService.findById(id);
    }

    @PostMapping
    public ResponseEntity<Book> save(@RequestBody Book book){
        return bookService.save(book);
    }
}
