package com.BookApp.controller;

import com.BookApp.model.Book;
import com.BookApp.service.BookService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

    @Autowired
    private BookService repository;

    BookController(BookService contactRepository) {
        this.repository = contactRepository;
    }

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Book> listProducts = repository.getAllBooks();
        model.addAttribute("listBooks", listProducts);

        return "menu";
    }

    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("book") Book product) {
        repository.addBook(product);

        return "redirect:/";
    }

    @RequestMapping("/new")
    public String showNewProductPage(Model model) {
        Book product = new Book();
        model.addAttribute("book", product);

        return "new_book";
    }

    @RequestMapping(value="/edit" , method = RequestMethod.GET)
    public ModelAndView showEditProductPage(@RequestParam(name = "bookId") int bookId) {
        ModelAndView mav = new ModelAndView("edit_book");
        Book product = repository.findBookById(bookId);
        mav.addObject("book", product);

        return mav;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String handleDeleteUser(@RequestParam(name = "bookId") int bookId) {
        repository.deleteBook(bookId);
        return "redirect:/";
    }
}
