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
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
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

    private Book book; 
    
    @BeforeEach
    public void init() {
        book = new Book();
        book.setAutor("Jano");
    }

    @Test
    public void CreateBook() {
        when(repository.save(any(Book.class))).thenReturn(new Book());
        
        service.createBook(book);
        verify(repository, times(1)).save(eq(book));
    }

    @Test
    public void UpdateBook() {
        service.updateBook(book);
        verify(repository, times(1)).save(eq(book));
    }

   /* @Test
    public void DeleteBook() {
        service.deleteBook(1L);
        verify(repository, times(1)).deleteById(eq(1L));
    }*/

    @Test
    public void GetBook() {
        when(repository.findById(any(Long.class))).thenReturn(Optional.of(book));
        service.getBook(1L);
        verify(repository, times(1)).findById(eq(1L));
    }
}
