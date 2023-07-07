package com.damera.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

	private Integer id;
	private String name;
	private String category;
	private String color;
	private Double price;
}
