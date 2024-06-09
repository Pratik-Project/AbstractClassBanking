package com.banking;

import java.util.Scanner;

public class Bank {

	public Account a;
	public Account a1;

	public void addAccount(Account account) {

		if (a == null) {
			a = account;
		} else if (a1 == null) {

			a1 = account;
		} else {
			System.out.println("Account full");
		}

	}

	/*
	 * public void a3() {
	 * 
	 * a.setAccountHolderName("rishab"); a.setAccountNumber(123);
	 * a.setAccountType("Savings");
	 * 
	 * }
	 */

	public void removeAccount(Account account) {

		if (a != null) {
			System.out.println(a.getAccountInfo());
		}
		if (a1 != null) {
			System.out.println(a1.getAccountInfo());
		}

	}

	public void displayAccounts() {

		// System.out.println(a.getAccountInfo());
		if (a != null) {
			System.out.println(a.getAccountInfo());
			if (a1 != null) {
				System.out.println(a1.getAccountInfo());
			}
		}

	}

}
