package com.example.dilarabayar.phonebook.repo;

import com.example.dilarabayar.phonebook.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepo extends JpaRepository<Contact, Long> {
}
