package com.Damera.PaymentApp;

public class PaymentServices {
	
	private IPayment payment;

	public IPayment getPayment() {
		return payment;
	}

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public PaymentServices(IPayment payment) {
		super();
		this.payment = payment;
	}
	
	public void doPayment() {
		boolean status = payment.processPayment(1200.0);
		
		if(status) {
			System.out.println("Payment Done..");
		}else {
			System.out.println("Order Payment Failed..");
		}
	}

}
