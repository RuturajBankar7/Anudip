package com.abstraction.bank;

public class SavingAccount extends BankAccount
{

	public static final double Fee=1;
	public SavingAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
		
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
			setBalance(getBalance()-(amount+Fee));
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
