package com.damera.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.damera.entity.AccountEntity;
import com.damera.entity.AccountPK;
import com.damera.repo.AccountRepository;

@Component
public class Dataloader implements ApplicationRunner {
	
	@Autowired
	private AccountRepository repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		AccountPK id = new AccountPK();
	    id.setAccountId(1212);
		id.setAccountNumber(986746378);
		
		AccountEntity account = new AccountEntity();
		account.setHolderName("Abhi");
		account.setBranch("Ameerpet");
		account.setId(id);
		
		repo.save(account);
	}

}
