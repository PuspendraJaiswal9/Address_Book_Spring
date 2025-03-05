package com.example.Spring_Address_Book.repository;

import com.example.Spring_Address_Book.model.AddressBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressBook,Long> {
}
