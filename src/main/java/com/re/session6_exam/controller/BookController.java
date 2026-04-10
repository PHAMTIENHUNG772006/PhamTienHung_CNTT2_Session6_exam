package com.re.session6_exam.controller;

import com.re.session6_exam.model.Book;
import com.re.session6_exam.repository.BookRepository;
import com.re.session6_exam.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping({"/", "/"})
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public String index(Model model) {

        List<Book> books = bookService.getBookList();

        model.addAttribute("books", books);

        return "list-book";
    }


    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") int id, Model model) {

        Book books = bookService.getBookById(id);


        model.addAttribute("book", books);

        return "detail/id";
    }
}
