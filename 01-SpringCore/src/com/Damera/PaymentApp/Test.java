package com.Damera.PaymentApp;

public class Test {

	public static void main(String[] args) {
		PaymentServices ps = new PaymentServices(new CreditCardPayment());
		ps.setPayment(new SodexoPayment());
		ps.doPayment();

	}

}
