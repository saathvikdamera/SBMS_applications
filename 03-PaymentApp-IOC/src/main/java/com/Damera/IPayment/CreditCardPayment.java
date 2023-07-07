package com.Damera.IPayment;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		System.out.println("CreditCard payment done...");
		return true;
	}

}
