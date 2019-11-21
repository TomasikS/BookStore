package com.BookApp;

import com.BookApp.config.AppConfig;
import com.BookApp.model.Book;
import com.BookApp.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(scanBasePackages = {
   "com.BookApp.config", "com.BookApp.dao", "com.BookApp.model", "com.BookApp.controller", "com.BookApp.service"})
public class BookStoreApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
               = new AnnotationConfigApplicationContext(AppConfig.class);

        BookService bookService = context.getBean(BookService.class);
           Long id=1L;
    
     String name="";
     String autor="";
    String zaner="";
   String datumvydania="";
     String vydavatelstvo="";
     int pocetstran=7;
    String jazyk="";
     String ISBN="";
     String Popis="";
    boolean dostupnost=true;
     int mnozstvonapredaj=7;
  int mnozstvonavypozicku=7;
    double cena=7;
    
    
    
        bookService.addBook(new Book( id,  name,  autor,  zaner, datumvydania, vydavatelstvo,  pocetstran, 
           jazyk,  ISBN, Popis, dostupnost,  mnozstvonapredaj,  mnozstvonavypozicku,  cena));
        SpringApplication.run(BookStoreApplication.class, args);
        context.close();

    }

}
