package com.Damera.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message = "Name should not be empty")
	@Size(min = 2,max = 15,message = "Name shold contain 2-15 characters only")
	private String name;
	
	@NotNull(message = "Price should not be null")
	@Positive(message = "Price should be +ve number")
	private Double price;
	
	@NotNull(message = "Quantity should not be null")
	@Positive(message = "Quantity should be +ve number")
	private Integer quantity;
	
}
