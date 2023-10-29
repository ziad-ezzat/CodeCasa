package com.example.digitallibrarymanagment.services;

import com.example.digitallibrarymanagment.dtos.BookDTO;

import java.util.List;

public interface BookService {

    List<BookDTO> getAllBooks();

    BookDTO getBookById(Long id);

    BookDTO createBook(BookDTO bookDTO);

    void updateBook(Long id, BookDTO bookDTO);

    void deleteBook(Long id);
}
