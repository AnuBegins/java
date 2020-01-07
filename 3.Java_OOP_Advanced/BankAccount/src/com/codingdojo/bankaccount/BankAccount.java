
//Create a BankAccount class to simulate some of the common account transactions that normally occur for a bank account such as displaying your account number, checking and savings amount, total amount. Of course, there are also methods to invoke, such as depositing a check, checking your balance, withdrawing money.
//
//Objectives:
//● Practice member variables
//● Practice instance methods and getter and setters
//● Implement static variables and methods.
//
//Tasks:
//● Create a BankAccount class.
//● The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
//● Create a class member (static) that has the number of accounts created thus far.
//● Create a class member (static) that tracks the total amount of money stored in every account created.
//● Create a private method that returns a random ten digit account number.
//● In the constructor, call the private method from above so that each user has a random ten digit account.
//● In the constructor, be sure to increment the account count.
//● Create a getter method for the user's checking account balance.
//● Create a getter method for the user's saving account balance.
//● Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
//● Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
//● Create a method to see the total money from the checking and saving.
//● Users should not be able to set any of the attributes from the class.



package com.codingdojo.bankaccount;
	import java.util.*;

public class BankAccount {

	private String accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	
	private static int numberOfAccounts 	= 0;
	private static double aggregateDeposits = 0;
	
	
	public BankAccount() {
		accountNumber = generateAccountNumber();
		numberOfAccounts++;
	}

//Create a private method that returns a random ten digit account number.
	private String generateAccountNumber() {
		String account 	= "";
		for (int i = 0; i <= 10; i++) {
			Random rand = new Random();
			int number 	= rand.nextInt(10);
			account 	+= number;
		}
		
		System.out.println("New account number: " + account);
		return account;		
	}
	
	
	
// INSTANCE methods --------------------------------------------------
	
	public void depositFunds(double amount, String accountType) {
		if (accountType == "checking") {
			System.out.println("Initial checking balance: " + checkingBalance );
			this.checkingBalance += amount;
			System.out.println("New checking balance: " + checkingBalance );
			
		} else if (accountType == "savings") {
			System.out.println("Initial savings balance: " + this.savingsBalance );
			this.savingsBalance += amount;
			System.out.println("New savings balance: " + this.savingsBalance );
			
		} else {
			System.out.println("Could not complete deposit. Sucks to be you.");
		}
	}
	
	
	
	public void withdrawFunds (double amount, String accountType) {
		if (accountType == "savings") {
			if (savingsBalance > amount) {
				savingsBalance -= amount;
				System.out.println("Amount withdrawn. Current savings acct balance: " +savingsBalance);
			}
			else {
				System.out.println("Insufficient funds. Current savings acct balance: " +savingsBalance);

			}
		}
		else if (accountType == "checking") {
			if (checkingBalance > amount) {
				checkingBalance -= amount;
				System.out.println("Amount withdrawn. Current checking acct balance: "+checkingBalance);
			}
			else {
				System.out.println("Insufficient funds. Current balance: "+checkingBalance);
			}
		}
		else { 
			return ;
		}
	}

	
	
	
// GETTER methods -------------------------------------	
	public static int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	
	public static double getAggregateDeposits() {
		return aggregateDeposits;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	
	public double getTotalBalance () {
		double totalBalance = getCheckingBalance() + getSavingsBalance(); 
		System.out.println("\nChecking balance: " + getCheckingBalance());
		System.out.println("Saving balance: " + getSavingsBalance());
		System.out.println("Total balance (Account "+accountNumber+"): "+totalBalance);
		
		return totalBalance;
	}
	
	
	
}
