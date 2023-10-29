package com.example.digitallibrarymanagment.dtos;

import lombok.Data;

@Data
public class BookTransactionDTO {
    private Long id;
    private Long userId;
    private Long bookId;
    private String issueDate;
    private String returnDate;
    private String issue;
}
