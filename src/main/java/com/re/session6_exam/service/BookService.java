package com.re.session6_exam.service;

import com.re.session6_exam.model.Book;
import com.re.session6_exam.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBookList(){

        List<Book> books = bookRepository.getBookList();


        return books;
    }


    public Book getBookById(int id){
        List<Book> books = bookRepository.getBookList();
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }

        return null;
    }
}
