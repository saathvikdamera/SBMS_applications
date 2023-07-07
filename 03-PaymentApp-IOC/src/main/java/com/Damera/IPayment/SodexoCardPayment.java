package com.Damera.IPayment;

public class SodexoCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		System.out.println("SodexoCard payment done..");
		return true;
	}

}
