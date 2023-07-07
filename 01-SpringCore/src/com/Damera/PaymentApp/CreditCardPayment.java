package com.Damera.PaymentApp;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		//logic
		System.out.println("CreditCard payment completed...");
		return true;
	}

}
