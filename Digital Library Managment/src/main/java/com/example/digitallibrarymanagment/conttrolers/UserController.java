package com.example.digitallibrarymanagment.conttrolers;

import com.example.digitallibrarymanagment.dtos.UserDTO;
import com.example.digitallibrarymanagment.entities.User;
import com.example.digitallibrarymanagment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public UserDTO createUser(UserDTO user){
        return userService.createUser(user);
    }
}
