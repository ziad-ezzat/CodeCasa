package com.example.digitallibrarymanagment.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book_transactions")
@Data
public class BookTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    private String issueDate;

    private String returnDate;

    private String issue;
}
