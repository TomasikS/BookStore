/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.service;


import com.BookApp.dao.BookDao;
import com.BookApp.model.Book;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stefan.tomasik
 */
@Service
public class BookServiceImpl implements BookService {

     
  @Autowired
   private BookDao bookDao;

   @Transactional
   public void addBook(Book book) {
      bookDao.add(book);
   }

    @Override
    public Book findBookById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void updateBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
   

}
