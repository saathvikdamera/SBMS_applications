package com.Damera.IPayment;

public class AmexCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billPrice) {
		System.out.println("AmexCard payment done..");
		return true;
	}

}
