package com.obpractice.demo.controllers;

import com.obpractice.demo.entities.Book;
import com.obpractice.demo.repositories.BookRepository;
import com.obpractice.demo.services.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
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
