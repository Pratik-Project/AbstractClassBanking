package com.banking;

public class Test {

	public static void main(String[] args) {

		Bank bank = new Bank();

		// bank.displayAccounts();

		SavingsAccount s = new SavingsAccount(1, "Rohit", 20000.00, "savings");

		s.getAccountInfo();

		CheckingAccount s1 = new CheckingAccount(2, "virat", 4000.00, "checking");

		s.deposit(100);
		System.out.println(s.balance);
		// s.withdraw(4000);
		// System.out.println(s.balance);
		// System.out.println(s1.getAccountInfo());

		// s1.deposit(1000);

		// System.out.println(s1.balance);

		// s1.withdraw(3000);

		// System.out.println(s1.balance);

		SavingsAccount s3 = new SavingsAccount(3, "rishab", 1000, "savings");

		// s3.setInterestRate(20);
		// s3.getInterestRate();
		// System.out.println(s3.getInterestRate());

		s.setInterestRate(20);

		System.out.println("Your  Interest is rs" + s.getInterestRate());

		s1.withdraw(6000);
		s1.checkOverdraft();

		s3.getAccountInfo();
		s3.setInterestRate(40);
		s3.getInterestRate();

		System.out.println("Your interest  is rs" + s3.getInterestRate());

		SavingsAccount s4 = new SavingsAccount(4, "Rohit", 20000.00, "saving");

		s4.getAccountInfo();

		s4.deposit(10000);

		System.out.println("Your Balance is rs" + s4.balance);

		s4.setInterestRate(10);

		System.out.println("Your Interest rate is rs" + s4.getInterestRate());

		CheckingAccount c2 = new CheckingAccount(2, "bumrah", 6000.00, "checking");

		System.out.println(c2.getAccountInfo());

		System.out.println("hello");
		SavingsAccount s5 = new SavingsAccount(5, "test", 10000.00, "savings");
		// bank.addAccount(s5);

		// System.out.println(s5.getAccountInfo());
		System.out.println("This is s5>>" + s5.accountHolderName);
		s5.setAccountHolderName("Hello");
		System.out.println(s5.accountHolderName);
		System.out.println(s5.getAccountInfo());

		bank.addAccount(s5);

		bank.addAccount(s4);
		bank.addAccount(s1);
		System.out.println("test");
		bank.displayAccounts();
		// bank.removeAccount(s1);

		CheckingAccount c1 = new CheckingAccount(7, "hello", 4000.00, "checking");
		System.out.println(c1.accountType);
	}

}
