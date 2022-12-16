package com.cg.thbook.controller;

import com.cg.thbook.model.Book;
import com.cg.thbook.service.BookService;
import com.cg.thbook.service.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {
    private final IBookService bookService = new BookService();

    @RequestMapping({"/","book"})
    public String handle(Model model){
        List<Book> bookList = bookService.findAll();
        model.addAttribute("books", bookList);
        return "index";
    }
}
