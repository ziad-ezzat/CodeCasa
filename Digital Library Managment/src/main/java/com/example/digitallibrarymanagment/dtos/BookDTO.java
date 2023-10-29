package com.example.digitallibrarymanagment.dtos;

import lombok.Data;

@Data
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private boolean isAvailable;
}
