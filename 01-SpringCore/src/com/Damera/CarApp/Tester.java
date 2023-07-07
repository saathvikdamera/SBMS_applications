package com.Damera.CarApp;

public class Tester {

	public static void main(String[] args) {
        
		//Constructor injection
		//Car car = new Car(new PetrolEngine());
		//car.drive();
		
		//Setter injection
        //Car car = new Car();
        //car.setEng(new DieselEngine());
        //car.drive();
		
		//field injection
	    Car car = new Car();
		car.eng = new PetrolEngine();
		car.drive();

	}

}
