package com.example.digitallibrarymanagment.mappers;

import com.example.digitallibrarymanagment.dtos.UserDTO;
import com.example.digitallibrarymanagment.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(UserDTO userDto);

    UserDTO toDto(User user);
}
