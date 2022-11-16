package com.solidprinciple.dip;

public class DebitCard implements BankCard{
	
	public void doTransaction(long amount) {
		System.out.println("Payment Using Debit Card");
	}
}
