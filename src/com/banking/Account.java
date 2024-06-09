package com.banking;

import java.util.Scanner;

abstract class Account {

	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	protected String accountType;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Account(int accountNumber, String accountHolderName, double balance, String accountType) {

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}

	abstract double deposit(int amount);

	abstract double withdraw(int amount);

	String getAccountInfo() {

		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", balance="
				+ balance + ", accountType=" + accountType + "]";
	}

}
