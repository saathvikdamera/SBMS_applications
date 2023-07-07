package com.damera.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "/orders_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String category;
	private String color;
	private Double price;
	
	public Order(String name, String category, String color, Double price) {
		super();
		this.name = name;
		this.category = category;
		this.color = color;
		this.price = price;
	}
	
}
