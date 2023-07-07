package com.Damera.IPayment;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		System.out.println("DebitCard payment done..");
		return true;
	}

}
