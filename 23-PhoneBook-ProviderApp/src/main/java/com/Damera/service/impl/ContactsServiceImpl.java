package com.Damera.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Damera.entity.ContactsEntity;
import com.Damera.repo.ContactsRepository;
import com.Damera.request.PersonDtls;
import com.Damera.service.ContactsService;

@Service
public class ContactsServiceImpl implements ContactsService {
	
	@Autowired
	private ContactsRepository repo;

	@Override
	public ContactsEntity saveContact(PersonDtls person) {
		
		ContactsEntity entity = new ContactsEntity();
		BeanUtils.copyProperties(person, entity);
		
		repo.save(entity);
		
		return entity;
	}
	
	@Override
	public ContactsEntity fetchContactById(Integer contactId) {
		
		ContactsEntity contact = repo.findById(contactId).get();
		
		return contact;
	}
	
	@Override
	public ContactsEntity updateContact(ContactsEntity entity) {
		
		ContactsEntity contact = repo.save(entity);
		
		return contact;
	}
	
	@Override
	public void deleteById(Integer contactId) {
		repo.deleteById(contactId);
	}
	
	@Override
	public List<ContactsEntity> getContacts() {
		return repo.findAll();
	}

}
