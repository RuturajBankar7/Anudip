package com.abstraction.bank;

public class CurrentAccount extends BankAccount
{

	public CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
		System.out.println("Amount of Rs. "+amount+" in current account from account number "+getAccountNumber()+" is added successfully and the balance is "+getBalance());
		
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=getBalance())
		{
			setBalance(getBalance()-amount);
			{
				System.out.println("Amount of Rs. "+amount+" in current account from account number "+getAccountNumber()+" is withdrawed successfully and the balance is "+getBalance());
			}
		}
		else
		{
			System.out.println("Insufficient funds");
		}
		
	}
	
}
