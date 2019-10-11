package com.BookApp.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class BookMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
       // book.setId(rs.getInt("id"));
        book.setAuthor(rs.getString(2));
        book.setName(rs.getString(3));
        book.setYear(rs.getInt(4));
        book.setType(1);
        
        System.out.println("autor" +rs.getString(2));
         System.out.println("autor" +rs.getString(3));
        return book;
    }

}
