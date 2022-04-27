package com.sg.bank;

import java.util.*;
class Account
{
	int balance;
	int accountnumber;
	int pinnumber;

	public void deposit(int amount)
	{
		if (amount>0)
		{
			balance =balance+amount;
			System.out.println("1.check balance");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("4.exit");
		}
		else
		{
			System.out.println("Enter valid amount");
			System.out.println("1.check balance");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("4.exit");
		}
	}

	public void withdraw(int amount)
	{
		if (balance-amount >0)
		{
			balance= balance-amount;
			System.out.println("1.check balance");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("4.exit");
		}
		else
		{
			System.out.println("No sufficient balance");	
			System.out.println("1.check balance");
			System.out.println("2.deposit");
			System.out.println("3.withdraw");
			System.out.println("4.exit");
		}
	}
	public void menu()
	{
	 	int option=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("                                          WELCOME TO TP BANK ");
		System.out.print("Enter the account number:");
		scan.nextInt();
		System.out.print("Enter the pin:");
		scan.nextInt();
		System.out.println();
		System.out.println("1.check balance");
		System.out.println("2.deposit");
		System.out.println("3.withdraw");
		System.out.println("4.exit");
		do
		{
			System.out.println("enter your option: ");
			option=scan.nextInt();
			System.out.println();

			switch (option)
			{

			case 1:
				System.out.println("balance="+ balance);
			    System.out.println();
				System.out.println("1.check balance");
				System.out.println("2.deposit");
				System.out.println("3.withdraw");
				System.out.println("4.exit");
				break;

			case 2:
				System.out.print("enter the deposit amount:");
			    int amount=scan.nextInt();
				deposit(amount);
				break;

			case 3:
				System.out.print("enter the withdraw amount: ");
			    int amount2=scan.nextInt();
				withdraw(amount2);
				break;

			case 4:
			    System.out.println("Thank you!!");
			    System.exit(0);

			default:
				System.out.println("Invalid option!! enter again:");
			    break;
			} 
		}
		while (option!='5');
		System.out.println("Thank you!!");
	}
}
class  BankAccount
{
	public static void main(String[] args) 
	{
		Account a=new Account();
		a.menu();
	}
}