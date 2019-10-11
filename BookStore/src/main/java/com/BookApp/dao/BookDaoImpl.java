/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.dao;

import com.BookApp.model.Book;
import com.BookApp.model.BookMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author stefan.tomasik
 */

@Transactional
@Component
public class BookDaoImpl implements BookDAO {
 
 @Autowired
 private JdbcTemplate jdbcTemplate;

 @Override
 public List<Book> getAllBooks() {
  String query = "SELECT * from Book";
  RowMapper<Book> rowMapper = new BookMapper();
  List<Book> list = jdbcTemplate.query(query, rowMapper);
  
  return list;
 }

 @Override
 public Book findeBookById(int id) {
  String query = "SELECT * from Book WHERE id = ?";
  RowMapper<Book> rowMapper = new BeanPropertyRowMapper<>(Book.class);
  Book book = jdbcTemplate.queryForObject(query, rowMapper, id);
  
  return book;
 }

 @Override
 public void addBook(Book book) {
  String query = "INSERT INTO Book(autor,nazov,rok,idzaner) VALUES(?, ?, ?, ?)";
  jdbcTemplate.update(query, book.getAuthor(),book.getName(),book.getYear(),1 );
 }

 @Override
 public void updateBook(Book book) {
  String query = "UPDATE Book SET first_name=?, last_name=?, email=?, phone=?, job_title=? WHERE employee_id=?";
  jdbcTemplate.update(query, query, book.getId(), book.getName(),book.getType(),book.getYear(),book.getAuthor() );
  
 }

 @Override
 public void deleteBook(int id) {
  String query = "DELETE FROM Book WHERE id=?";
  jdbcTemplate.update(query, id);
 }

 

}