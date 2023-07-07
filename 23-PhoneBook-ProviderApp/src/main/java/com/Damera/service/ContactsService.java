package com.Damera.service;

import java.util.List;

import com.Damera.entity.ContactsEntity;
import com.Damera.request.PersonDtls;

public interface ContactsService {
	
	List<ContactsEntity> getContacts();

	ContactsEntity saveContact(PersonDtls person);
	
	ContactsEntity fetchContactById(Integer contactId);
	
	ContactsEntity updateContact(ContactsEntity entity);
	
	void deleteById(Integer contactId);

}
