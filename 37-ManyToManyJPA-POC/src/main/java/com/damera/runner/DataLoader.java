package com.damera.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.damera.entity.AuthorEntity;
import com.damera.entity.BookEntity;
import com.damera.repo.AuthorRepository;
import com.damera.repo.BookRepository;

@Component
public class DataLoader implements ApplicationRunner {

	@Autowired
	private BookRepository bookRepo;

	@Autowired
	private AuthorRepository authRepo;

	@Override
	public void run(ApplicationArguments args) throws Exception {


		BookEntity b1 = new BookEntity(); b1.setBookName("Core Java");
		b1.setPrice(1500.00);

		AuthorEntity a1 = new AuthorEntity(); a1.setAuthorName("James");

		AuthorEntity a2 = new AuthorEntity(); a2.setAuthorName("Jhon");

		b1.setAuthors(Arrays.asList(a1,a2));

		bookRepo.save(b1);

		/*
		 * BookEntity b2 = new BookEntity(); b2.setBookName("JRTP");
		 * b2.setPrice(2000.00);
		 * 
		 * 
		 * BookEntity b3 = new BookEntity(); b3.setBookName("SBMS");
		 * b3.setPrice(1200.00);
		 * 
		 * AuthorEntity a3 = new AuthorEntity(); a3.setAuthorName("David");
		 * a3.setBooks(Arrays.asList(b2,b3));
		 * 
		 * authRepo.save(a3);
		 */
	}

}
