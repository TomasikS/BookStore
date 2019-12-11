/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

/**
 *
 * @author stefan.tomasik
 */

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@ExtendWith(MockitoExtension.class)
public class DemoTest {

    @Mock
    BookRepository repository;

    @InjectMocks
    BookService service = new BookService();

    @Test
    public void CreateBook() {
        when(repository.save(any(Book.class))).thenReturn(new Book());

        Book book = new Book();
        book.setAutor("Jano");
        service.createBook(book);
        verify(repository, times(1)).save(eq(book));
    }

      @Test
    public void UpdateBook() {
        when(repository.save(any(Book.class))).thenReturn(new Book());
       Book oldBook = new Book();
        oldBook.setAutor("Jano");
        service.updateBook(oldBook);
        verify(repository, times(1)).save(eq(oldBook));
    }
    
}
