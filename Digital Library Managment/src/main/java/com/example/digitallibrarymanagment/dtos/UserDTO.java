package com.example.digitallibrarymanagment.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private int role;
}

