package com.PhilippGuggi.BankingApp;

import java.util.Scanner;

class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid) {
		customerName = cname;
		customerId = cid;
	}
	
	void deposit (int amount) {
		if (amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw (int amount) {
		if (amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occured");
		}
	}
	
	void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerId);
		System.out.println("\n");
		System.out.println("Check Balance");
		System.out.println("Deposit");
		System.out.println("Withdraw");
		System.out.println("Previous Transaction");
		System.out.println("Exit");
		
		do {
			System.out.println("====================");
			System.out.println("Enter an option:");
			System.out.println("====================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option) {
			case 'A':
				System.out.println("---------------");
				System.out.println("Balance = " + balance);
				System.out.println("---------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("---------------");
				System.out.println("Enter an amount to deposit:");
				System.out.println("----------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				
			
			}
		}
	}
}

public class BankingApp {
	public static void main(String[] args) {
		
	}
}
