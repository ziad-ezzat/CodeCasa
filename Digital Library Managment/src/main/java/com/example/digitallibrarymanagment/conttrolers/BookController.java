package com.example.digitallibrarymanagment.conttrolers;

import com.example.digitallibrarymanagment.dtos.BookDTO;
import com.example.digitallibrarymanagment.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookDTO> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping
    public BookDTO createBook(BookDTO book){
        return bookService.createBook(book);
    }
}
