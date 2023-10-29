package com.example.digitallibrarymanagment.conttrolers;

import com.example.digitallibrarymanagment.dtos.BookTransactionDTO;
import com.example.digitallibrarymanagment.services.BookTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bookTransaction")
public class BookTransactionController {

    @Autowired
    private BookTransactionService bookTransactionService;

    @GetMapping
    public List<BookTransactionDTO> getAllBookTransactions(){
        return bookTransactionService.getAllBookTransactions();
    }

    @PostMapping
    public BookTransactionDTO createBookTransaction(BookTransactionDTO bookTransaction){
        return bookTransactionService.createBookTransaction(bookTransaction);
    }
}
