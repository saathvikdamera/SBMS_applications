package com.Damera.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.Damera.entity.ContactsEntity;
import com.Damera.service.ContactService;

import reactor.core.publisher.Mono;

@Service
public class ContactServiceImpl implements ContactService {
	
	private String GET_ALLCONTACTS_URL = "http://localhost:8080/getContacts";
	
	private String GET_CONTACTBYID_URL = "http://localhost:8080/get/{id}";
	
	private String PUT_CONTACT_URL = "http://localhost:8080/update";
	
	private String DELETE_CONTACTBYID_URL = "http://localhost:8080/delete/{id}";


	@Override
	public List<ContactsEntity> getContacts() {
		
		WebClient webClient = WebClient.create();
		
		Mono<List<ContactsEntity>> response = webClient.get()
		         .uri(GET_ALLCONTACTS_URL)
		         .retrieve()
		         .bodyToMono(new ParameterizedTypeReference<List<ContactsEntity>>() {});
		
		List<ContactsEntity> contacts = response.block();
		
		return contacts;
	}
	
	@Override
	public ContactsEntity getContactById(Integer contactId) {
		
		WebClient webClient = WebClient.create();
		
		ContactsEntity entity = webClient.get()
		         .uri(GET_CONTACTBYID_URL, contactId)
		         .retrieve()
		         .bodyToMono(ContactsEntity.class)
		         .block();
		
		return entity;
	}
	
	@Override
	public ContactsEntity updateContact(ContactsEntity contact) {
		
		WebClient webClient = WebClient.create();
		
		ContactsEntity entity = webClient.put()
		         .uri(PUT_CONTACT_URL)
		         .bodyValue(contact)
		         .retrieve()
		         .bodyToMono(ContactsEntity.class)
		         .block();
		
		
		return entity;
	}
	
	@Override
	public String deleteContact(Integer contactId) {
		WebClient webClient = WebClient.create();
		
		String succMsg = webClient.delete()
		         .uri(DELETE_CONTACTBYID_URL, contactId)
		         .retrieve()
		         .bodyToMono(String.class)
		         .block();
		
		if(succMsg != null) {
			return succMsg;
		}
		return "Deletion failed";
	}
}
