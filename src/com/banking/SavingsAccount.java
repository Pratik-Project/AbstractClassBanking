package com.banking;

public class SavingsAccount extends Account {

	private double interestRate;

	public SavingsAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.interestRate = interestRate;
	}

	@Override
	String getAccountInfo() {

		System.out.println("Account Number>>" + this.getAccountNumber());
		System.out.println("Account Holder Name>>" + this.getAccountHolderName());
		System.out.println("Account Balance>>" + this.getBalance());

		return null;
	}

	@Override
	public double deposit(int amount) {
		// System.out.println("Your balance is>>"+balance);
		return balance = balance + amount;
	}

	@Override
	double withdraw(int amount) {
		if (balance > amount) {

		} else {
			System.out.println("Insufficient Balance");
		}

		return balance = balance - amount;

	}

	public double getInterestRate() {
		return balance * interestRate / 100;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
