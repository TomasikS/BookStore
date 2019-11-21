/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.dao;

import com.BookApp.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stefan.tomasik
 */

@Repository
public class BookDaoImp  implements BookDao{

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(Book book) {
      sessionFactory.getCurrentSession().save(book);
   }
    
}
