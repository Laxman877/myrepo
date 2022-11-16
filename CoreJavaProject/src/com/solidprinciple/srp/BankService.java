package com.solidprinciple.srp;

public class BankService {

	public long deposite(long amount, String accountNo) {
		
		return 0;
	}

	public long withDraw(long amount, String accountNo) {
		
		return 0;
	}

	public void printPassbook() {

	}

	public void getLoanInterestInfo(String loanType) {
		if (loanType.equals("homeloan")) {

		}
		if (loanType.equals("personalLoan")) {

		}
		if (loanType.equals("car")) {

		}
	}

	public void sendOtp(String medium) {
		if (medium.equals("email")) {
			// email related logic
		}
	}
}
