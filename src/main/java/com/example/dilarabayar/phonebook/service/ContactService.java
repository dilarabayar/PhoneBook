package com.example.dilarabayar.phonebook.service;

import com.example.dilarabayar.phonebook.model.Contact;
import com.example.dilarabayar.phonebook.repo.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepo contactRepo;

    @Autowired
    public ContactService(ContactRepo contactRepo) {
        this.contactRepo = contactRepo;
    }

    public Contact addContact(Contact contact){
        return contactRepo.save(contact);
    }

    public List<Contact> listAllContacts(){
        return contactRepo.findAll();
    }
}
