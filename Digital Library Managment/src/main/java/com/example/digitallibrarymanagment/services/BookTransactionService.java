package com.example.digitallibrarymanagment.services;


import com.example.digitallibrarymanagment.dtos.BookTransactionDTO;

import java.util.List;

public interface BookTransactionService {

    List<BookTransactionDTO> getAllBookTransactions();

    BookTransactionDTO getBookTransactionById(Long id);

    BookTransactionDTO createBookTransaction(BookTransactionDTO bookTransactionDTO);

    void updateBookTransaction(Long id, BookTransactionDTO bookTransactionDTO);

    void deleteBookTransaction(Long id);
}
