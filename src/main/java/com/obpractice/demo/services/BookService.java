package com.obpractice.demo.services;

import com.obpractice.demo.entities.Book;
import com.obpractice.demo.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    //probando leer variables de entorno
//    @Value("${app.var1}")
//    String var1;

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public ResponseEntity<List<Book>> findAll(){
        //System.out.println(var1);
        Optional<List<Book>> optionalBooks = Optional.of(bookRepository.findAll());
        return optionalBooks.map(books -> new ResponseEntity<>(books, HttpStatus.OK)).orElseGet(()-> ResponseEntity.notFound().build());
    }

    public ResponseEntity<Book> findById(Long id){
        Optional<Book> optionalBook = bookRepository.findById(id);
        return optionalBook.map(book -> new ResponseEntity<>(book, HttpStatus.OK)).orElse(ResponseEntity.notFound().build());
    }

    public ResponseEntity<Book> save(Book book){
        Optional<Book> optionalBook = Optional.of(bookRepository.save(book));
        System.out.println(optionalBook);
        return optionalBook.map(book1 -> new ResponseEntity<>(book1, HttpStatus.CREATED)).orElse(ResponseEntity.notFound().build());
    }
}
