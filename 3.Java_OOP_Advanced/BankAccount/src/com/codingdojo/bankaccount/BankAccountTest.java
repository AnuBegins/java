package com.codingdojo.bankaccount;
import java.util.*;


public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount acct = new BankAccount();
		acct.depositFunds(99999.99, "checking");
		acct.depositFunds(.01, "savings");
		acct.getTotalBalance();
	}

}
