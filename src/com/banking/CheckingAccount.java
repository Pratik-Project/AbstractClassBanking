package com.banking;

public class CheckingAccount extends Account {

	private double overdraftLimit;

	public CheckingAccount(int accountNumber, String accountHolderName, double balance, String accountType) {
		super(accountNumber, accountHolderName, balance, accountType);

	}

	@Override
	String getAccountInfo() {

		return "Account number>>" + this.getAccountNumber() + ">>>" + "Account name" + this.getAccountHolderName()
				+ ">>>" + "Account Balance>>>" + this.getBalance()+this.accountType;

	}

	public void checkOverdraft() {

		if (balance < 0) {
			System.out.println("Your account is overdraft");
		} else {
			System.out.println("Account is not overdraft");
		}

	}

	@Override
	public double deposit(int amount) {
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
}
