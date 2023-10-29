package com.example.digitallibrarymanagment.mappers;

import com.example.digitallibrarymanagment.dtos.BookDTO;
import com.example.digitallibrarymanagment.entities.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDTO bookDto);

    BookDTO toDto(Book book);
}
