package com.Damera.beans;

import org.springframework.stereotype.Component;

@Component
public class Chip {
	
	public Chip() {
		System.out.println("Chip :: Constuctor");
	}
	
	public String chipType(){
		System.out.println("Chip class method");
		return "32-bit";
	}

}
