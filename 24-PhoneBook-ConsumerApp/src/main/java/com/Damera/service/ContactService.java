package com.Damera.service;

import java.util.List;

import com.Damera.entity.ContactsEntity;

public interface ContactService {
	
	List<ContactsEntity> getContacts();
	
	ContactsEntity getContactById(Integer contactId);
	
	ContactsEntity updateContact(ContactsEntity contact);
	
	String deleteContact(Integer contactId);
}
