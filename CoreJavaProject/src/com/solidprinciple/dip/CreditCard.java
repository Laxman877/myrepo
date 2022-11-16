package com.solidprinciple.dip;

public class CreditCard implements BankCard{

	public void doTransaction(long amount) {
		System.out.println("Payment Using cradit Card");
	}
}
