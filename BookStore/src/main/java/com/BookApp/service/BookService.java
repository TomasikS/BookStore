/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.service;

import com.BookApp.model.Book;
import java.util.List;

/**
 *
 * @author stefan.tomasik
 */
public interface BookService {
public List<Book> getAllBooks();
 
 public Book findBookById(int id);
 
 public void addBook(Book book);
 
 public void updateBook(Book book);
 
 public void deleteBook(int id);
}
