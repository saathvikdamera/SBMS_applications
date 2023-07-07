package com.Damera.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Damera.entity.ContactsEntity;
import com.Damera.request.PersonDtls;
import com.Damera.service.ContactsService;

@RestController
public class ContactsRestController {
	
	@Autowired
	private ContactsService service;

	@PostMapping(value = "/create", consumes = "application/json")
	public ResponseEntity<ContactsEntity> createContact(@RequestBody PersonDtls person) {
		
		ContactsEntity contact = service.saveContact(person);
		
		return new ResponseEntity<ContactsEntity>(contact, HttpStatus.CREATED);
	}
	
	
	@GetMapping( value = "/get/{id}", produces = "application/json")
	public ContactsEntity getContact(@PathVariable Integer id){
		
		ContactsEntity contact = service.fetchContactById(id);
		return contact;
	}
	
	
	@GetMapping( value = "/getContacts" ,produces = "application/json")
	public ResponseEntity<List<ContactsEntity>> getAllContacts(){
		
		List<ContactsEntity> contacts = service.getContacts();
		
		return new ResponseEntity<List<ContactsEntity>>(contacts, HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/update", produces = "application/json", consumes = "application/json")
	public ContactsEntity updateContact(@RequestBody ContactsEntity contact) {
		
		ContactsEntity newContact = service.updateContact(contact);
		return newContact;
	
	}
	
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable Integer id){
		
		service.deleteById(id);
		
		return new ResponseEntity<String>("contact deleted",HttpStatus.OK);
	}
	
	
}
