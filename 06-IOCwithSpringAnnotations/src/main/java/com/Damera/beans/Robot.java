package com.Damera.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Robot {
	
	@Autowired
	private Chip chip;
	
	public Robot() {
		System.out.println("Robot :: Constructor");
	}
	
	public void startAction() {
		String type = chip.chipType();
		System.out.println(type);
	}

}
