/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stefan.tomasik
 */
@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/books")
    public ResponseEntity< Book> createBook(@RequestBody Book book) {

//        return ResponseEntity.ok().body(service.createBook(book));
        service.createBook(book);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @PutMapping("/books/{id}")
    public ResponseEntity< Book> updateBook(@PathVariable Long id, @RequestBody Book book) throws ResourceNotFoundException {

//      return ResponseEntity.ok().body(service.updateBook(book));
        service.updateBook(book);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable Long id) throws ResourceNotFoundException {

        service.deleteBook(id);

        return HttpStatus.OK;
    }

    @GetMapping("/books/{id}")
    public ResponseEntity< Book> getBook(@PathVariable Long id) throws ResourceNotFoundException {

        Book book = service.getBook(id);

        return ResponseEntity.ok().body(book);
        //     return new ResponseEntity<>(HttpStatus.OK);

    }

}
