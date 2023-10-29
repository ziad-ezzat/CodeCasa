package com.example.digitallibrarymanagment.repositorys;

import com.example.digitallibrarymanagment.entities.BookTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookTransactionRepository extends JpaRepository<BookTransaction, Long> {
    // You can add custom query methods here if needed
}
