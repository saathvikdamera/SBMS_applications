package com.Damera.IPayment;

public class PaymentService {
	
	private IPayment payment;

	public PaymentService(IPayment payment) {
		super();
		this.payment = payment;
	}
	
	public PaymentService() {
		// TODO Auto-generated constructor stub
	}
	
	public IPayment getPayment() {
		return payment;
	}



	public void setPayment(IPayment payment) {
		this.payment = payment;
	}



	public void doPayment(double billPrice) {
		boolean status = payment.processPayment(billPrice);
		
		if(status) {
			System.out.println("Payment successful...");
		}else {
			System.out.println("Failes to pay...");
		}
		
	}

}
