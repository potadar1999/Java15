package com.que3;


import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void doTransactions(List<? extends Payment> list) {
		
		for(Payment n1:list) {
			System.out.println(n1);
			n1.doPayment();
		}
		
		for(Payment n2:list) {
			System.out.println(n2);
			n2.doPayment();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Payment>amounts=Arrays.asList(50);
//		
//		doTransactions(amounts);
		
		
//		List<Integer>blist=Arrays.asList(18000,8054810);
//		
//		doTransactions(blist);
	}

}
