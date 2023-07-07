package com.Damera.CarApp;

public class Car {
	
    IEngine eng;
	
	public Car() {
		
	}
	
	public Car(IEngine eng) {
		super();
		this.eng = eng;
	}
	
	public IEngine getEng() {
		return eng;
	}

	public void setEng(IEngine eng) {
		this.eng = eng;
	}

	public void drive() {
		int i = eng.start();
		
		if(i >= 1) {
			System.out.println("Journey Started...");
		}else {
			System.out.println("Engine failed...");
		}
	}

}
