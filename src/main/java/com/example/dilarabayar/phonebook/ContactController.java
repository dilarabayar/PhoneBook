package com.example.dilarabayar.phonebook;

import com.example.dilarabayar.phonebook.model.Contact;
import com.example.dilarabayar.phonebook.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/phonebook")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Contact>> getAllEmployees () {
        List<Contact> employees = contactService.listAllContacts();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
