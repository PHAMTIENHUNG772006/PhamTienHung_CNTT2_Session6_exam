package com.re.session6_exam.repository;

import com.re.session6_exam.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    public List<Book> getBookList(){
        List<Book> books = new ArrayList<>();

        books.add(new Book(1,"Conan","Hungw",500));
        books.add(new Book(2,"Doraemon","Quang",200));
        books.add(new Book(3,"Chiếc lược ngà"," Lợi",1500));
        books.add(new Book(4,"lão hạc","Trang",120));
        books.add(new Book(5,"gà gô","Hoagn",340));


        return books;
    }
}
