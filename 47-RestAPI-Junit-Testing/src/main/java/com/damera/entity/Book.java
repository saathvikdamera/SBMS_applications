package com.damera.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

	private Integer id;
	private String name;
	private Double price;
}
