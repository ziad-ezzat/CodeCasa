package com.example.digitallibrarymanagment.services;

import com.example.digitallibrarymanagment.dtos.BookTransactionDTO;
import com.example.digitallibrarymanagment.entities.BookTransaction;
import com.example.digitallibrarymanagment.mappers.BookTransactionMapper;
import com.example.digitallibrarymanagment.repositorys.BookTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTransactionServiceImpl implements BookTransactionService{

    @Autowired
    private BookTransactionRepository bookTransactionRepository;

    @Autowired
    private BookTransactionMapper bookTransactionMapper;

    @Override
    public List<BookTransactionDTO> getAllBookTransactions() {
        return bookTransactionRepository.findAll().stream().map(bookTransactionMapper::toDto).toList();
    }

    @Override
    public BookTransactionDTO getBookTransactionById(Long id) {
        BookTransaction bookTransaction = bookTransactionRepository.findById(id).orElseThrow();
        return bookTransactionMapper.toDto(bookTransaction);
    }

    @Override
    public BookTransactionDTO createBookTransaction(BookTransactionDTO bookTransactionDTO) {
        BookTransaction bookTransaction = bookTransactionMapper.toEntity(bookTransactionDTO);
        bookTransaction = bookTransactionRepository.save(bookTransaction);
        return bookTransactionMapper.toDto(bookTransaction);
    }

    @Override
    public void updateBookTransaction(Long id, BookTransactionDTO bookTransactionDTO) {
        BookTransaction bookTransaction = bookTransactionRepository.findById(id).orElseThrow();
        bookTransaction = bookTransactionMapper.toEntity(bookTransactionDTO);
        bookTransaction = bookTransactionRepository.save(bookTransaction);
    }

    @Override
    public void deleteBookTransaction(Long id) {
        bookTransactionRepository.deleteById(id);
    }
}
