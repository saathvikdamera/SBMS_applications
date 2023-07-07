package com.Damera.PaymentApp;

public class AmexPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		//logic
		System.out.println("Amex card payment completed...");
		return true;
	}

}
