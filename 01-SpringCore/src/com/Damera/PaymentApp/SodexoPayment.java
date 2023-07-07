package com.Damera.PaymentApp;

public class SodexoPayment implements IPayment {
	
	@Override
	public boolean processPayment(double billPrice) {
		//logic
				System.out.println("Sodexo card payment completed...");
				return true;
	}

}
