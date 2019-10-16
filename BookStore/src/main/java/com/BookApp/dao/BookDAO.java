package com.BookApp.dao;

import com.BookApp.model.Book;
import java.util.List;

public interface BookDAO {
public List<Book> getAllBooks();
 
 public Book findBookById(int id);
 
 public void addBook(Book book);
 
 public void updateBook(Book book);
 
 public void deleteBook(int id);;
}
