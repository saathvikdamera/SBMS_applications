package com.Damera.carApp;

public class Car {
	
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int i = eng.start();
		
		if(i >= 1) {
			System.out.println("Car started....");
		}else {
			System.out.println("Car failed to start....");
		}
	}

}
