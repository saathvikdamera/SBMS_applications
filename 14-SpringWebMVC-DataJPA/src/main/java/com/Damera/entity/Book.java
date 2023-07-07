package com.Damera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	private Integer bookId;
	private String bookName;
	private Double price;

}
