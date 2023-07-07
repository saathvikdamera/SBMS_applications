package com.Damera.PaymentApp;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		//logic
		System.out.println("DebitCard payment completed...");
		return true;
	}
}
