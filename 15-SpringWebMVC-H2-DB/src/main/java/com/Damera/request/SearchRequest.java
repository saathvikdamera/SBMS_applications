package com.Damera.request;

import lombok.Data;

@Data
public class SearchRequest {
	
	private Integer pid;
	private String name;
	private Double price;
	private Integer quantity;

}
