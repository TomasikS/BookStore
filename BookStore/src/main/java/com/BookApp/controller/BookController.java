/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.controller;

import com.BookApp.model.Book;
import com.BookApp.repository.BookRepository;
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
    BookRepository service;
    
    @PostMapping("/books")
    public ResponseEntity< Book> createBook(@RequestBody Book book) {
        
        return ResponseEntity.ok().body(service.save(book));
    }
    
    @PutMapping("/books/{id}")
    public ResponseEntity< Book> updateBook(@PathVariable Long id, @RequestBody Book book) throws ResourceNotFoundException {
        Book oldBook = service.findById(id).orElseThrow(() -> new ResourceNotFoundException("" + id));
        oldBook.setAutor(book.getAutor());
        oldBook.setCena(book.getCena());
        oldBook.setJazyk(book.getJazyk());
        oldBook.setPopis(book.getPopis());
        oldBook.setVydavatelstvo(book.getVydavatelstvo());
        oldBook.setDostupnost(book.getDostupnost());
        return ResponseEntity.ok().body(service.save(oldBook));
    }
    
    @DeleteMapping("/books/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id) throws ResourceNotFoundException {
        
        Book book = service.findById(id).orElseThrow(() -> new ResourceNotFoundException("" + id));
        
        service.deleteById(book.getId());
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/books/{id}")
    public ResponseEntity< Book> getBook(@PathVariable Long id) throws ResourceNotFoundException {
        
        Book book = service.findById(id).orElseThrow(() -> new ResourceNotFoundException("" + id));
        
        return ResponseEntity.ok().body(book);
        
    }
    
}
