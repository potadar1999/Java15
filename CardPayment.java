package com.que3;

public class CardPayment implements Payment {
	private int amount;
	
	


	public CardPayment(int amount) {
		super();
		this.amount = amount;
	}




	@Override
	public void doPayment() {
		System.out.println("Payment done using Cash "+ amount);
		
	}
	
	

}
