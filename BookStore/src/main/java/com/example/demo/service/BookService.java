/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefan.tomasik
 */
@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public Book createBook(Book entity) {
        Book newEntity = repository.save(entity);
        return newEntity;
    }

    public Book updateBook(Book oldBook) {
        oldBook.setAutor(oldBook.getAutor());
        oldBook.setCena(oldBook.getCena());
        oldBook.setJazyk(oldBook.getJazyk());
        oldBook.setPopis(oldBook.getPopis());
        oldBook.setVydavatelstvo(oldBook.getVydavatelstvo());
        oldBook.setDostupnost(oldBook.getDostupnost());
        return repository.save(oldBook);
    }

    public Book getBook(Long id) {
      return   repository.findById(id).get();

    }

   /* public void deleteBook(Long id) {
 
        repository.deleteById(id);

    }*/

}
