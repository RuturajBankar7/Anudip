package com.abstraction.bank;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount ca=new CurrentAccount("12de",1000);
		SavingAccount sa=new SavingAccount("13de",1000);
		
		ca.deposit(200);
		ca.withdraw(200);
		
		sa.deposit(200);
		sa.withdraw(200);

	}

}
