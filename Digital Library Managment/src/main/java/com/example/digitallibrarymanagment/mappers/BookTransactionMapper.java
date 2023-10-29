package com.example.digitallibrarymanagment.mappers;

import com.example.digitallibrarymanagment.dtos.BookTransactionDTO;
import com.example.digitallibrarymanagment.entities.BookTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookTransactionMapper {

    BookTransaction toEntity(BookTransactionDTO bookTransactionDTO);

    BookTransactionDTO toDto(BookTransaction bookTransaction);
}
