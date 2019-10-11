package com.BookApp.controller;

import com.BookApp.model.Book;
import com.BookApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

    @Autowired
    private BookService repository;

    BookController(BookService contactRepository) {
        this.repository = contactRepository;
    }

    @RequestMapping(value = "/developers", method = RequestMethod.POST)
    public String developersAdd(@RequestParam String email,
            @RequestParam String firstName, @RequestParam String lastName, Model model) {

        Book newDeveloper = new Book();
        newDeveloper.setAuthor(email);
        newDeveloper.setName(firstName);
        newDeveloper.setYear(Integer.parseInt(lastName));

        repository.addBook(newDeveloper);

        model.addAttribute("developer", newDeveloper);
        return "index";
    }

    @RequestMapping("/developer/{id}")
    public String developer(@PathVariable Long id, Model model) {
        model.addAttribute("developer", repository.getAllBooks().get(0));
        return "developer";
    }

    @RequestMapping(value = "/developers", method = RequestMethod.GET)
    public String BooksList(Model model) {
        model.addAttribute("developers", repository.getAllBooks());
        return "list";
    }
}
