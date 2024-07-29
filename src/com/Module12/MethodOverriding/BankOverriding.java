package com.Module12.MethodOverriding;



import java.util.Scanner;

// Parent class BankAccount
class BankAccount
{
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        super();
        this.balance = initialBalance;
    }
    
    // Method to deposit money
    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposit of Rs. " + amount + " successful");
    }
    
    // Method to withdraw money
    public void withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawal of Rs. " + amount + " successful");
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
    
    // Method to get current balance
    public double getBalance()
    {
        return balance;
    }
}

// Child class SavingsAccount extending BankAccount
class SavingsAccount extends BankAccount
{
    private static final double withdrawal_limit = 200.0;
    
    // Constructor to initialize balance
    public SavingsAccount(double initialBalance)
    {
        super(initialBalance);
    }
    
    // Method overriding to withdraw money with limit
    public void withdraw(double amount)
    {
        if(amount <= getBalance() && amount <= withdrawal_limit)
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Withdrawal limit exceeded or insufficient funds");
        }
    }
}

// Child class CheckingAccount extending BankAccount
class CheckingAccount extends BankAccount
{
    private static final double transaction_fee = 1.0;
    
    // Constructor to initialize balance
    public CheckingAccount(double initialBalance)
    {
        super(initialBalance);
    }
    
    // Method overriding to withdraw money with transaction fee
    public void withdraw(double amount)
    {
        if(amount + transaction_fee <= getBalance())
        {
            super.withdraw(amount + transaction_fee);
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }
}

public class BankOverriding {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Get initial balance for Savings Account
        System.out.println("Enter the initial balance for Savings Account: ");
        double initialBalanceSavings = sc.nextDouble();
        SavingsAccount sa = new SavingsAccount(initialBalanceSavings);
        
        // Get initial balance for Checking Account
        System.out.println("Enter initial balance for Checking Account: ");
        double initialBalanceChecking = sc.nextDouble();
        CheckingAccount ca = new CheckingAccount(initialBalanceChecking);
        
        // Menu options
        System.out.println("Options:");
        System.out.println("1. Deposit only in Savings Account");
        System.out.println("2. Deposit only in Checking Account");
        System.out.println("3. Deposit in both Savings Account and Checking Account");
        System.out.println("4. Withdraw only from Savings Account");
        System.out.println("5. Withdraw only from Checking Account");
        System.out.println("6. Withdraw from both Savings Account and Checking Account");
        System.out.println("7. Do all (Deposit and Withdraw from both Savings Account and Checking Account)");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        // Handle user choice
        switch(choice)
        {
        case 1:
            System.out.println("Enter amount to deposit into Savings Account: ");
            double depositAmountSavings = sc.nextDouble();
            sa.deposit(depositAmountSavings);
            break;
            
        case 2:
            System.out.println("Enter amount to deposit into Checking Account: ");
            double depositAmountChecking = sc.nextDouble();
            ca.deposit(depositAmountChecking);
            break;
            
        case 3:
            System.out.println("Enter amount to deposit into Savings Account: ");
            depositAmountSavings = sc.nextDouble();
            sa.deposit(depositAmountSavings);
            System.out.println("Enter amount to deposit into Checking Account: ");
            depositAmountChecking = sc.nextDouble();
            ca.deposit(depositAmountChecking);
            break;
            
        case 4:
            System.out.println("Enter amount to withdraw from Savings Account: ");
            double withdrawalAmountSavings = sc.nextDouble();
            sa.withdraw(withdrawalAmountSavings);
            break;
            
        case 5:
            System.out.println("Enter amount to withdraw from Checking Account: ");
            double withdrawalAmountChecking = sc.nextDouble();
            ca.withdraw(withdrawalAmountChecking);
            break;
            
        case 6:
            System.out.println("Enter amount to withdraw from Savings Account: ");
            withdrawalAmountSavings = sc.nextDouble();
            sa.withdraw(withdrawalAmountSavings);
            System.out.println("Enter amount to withdraw from Checking Account: ");
            withdrawalAmountChecking = sc.nextDouble();
            ca.withdraw(withdrawalAmountChecking);
            break;
            
        case 7:
            System.out.println("Enter amount to deposit into Savings Account: ");
            depositAmountSavings = sc.nextDouble();
            sa.deposit(depositAmountSavings);
            System.out.println("Enter amount to deposit into Checking Account: ");
            depositAmountChecking = sc.nextDouble();
            ca.deposit(depositAmountChecking);
            System.out.println("Enter amount to withdraw from Savings Account: ");
            withdrawalAmountSavings = sc.nextDouble();
            sa.withdraw(withdrawalAmountSavings);
            System.out.println("Enter amount to withdraw from Checking Account: ");
            withdrawalAmountChecking = sc.nextDouble();
            ca.withdraw(withdrawalAmountChecking);
            break;
            
        default:
            System.out.println("Invalid choice");
        }
        
        // Print final balances
        System.out.println("Final balance in Savings Account: Rs." + sa.getBalance());
        System.out.println("Final balance in Checking Account: Rs." + ca.getBalance());
    }
}

/*
Dry Run-
1.User Input for Initial Balances:

User enters initial balance for Savings Account (e.g., 1000.0).
User enters initial balance for Checking Account (e.g., 500.0).

2.Display Menu and User Choice:

Menu options are displayed.
User selects an option (e.g., 7 for depositing and withdrawing from both accounts).

3.Case 7 Execution:

Deposit to Savings Account:
User is prompted to enter the amount to deposit into the Savings Account.
User enters 200.0.
sa.deposit(200.0) prints "Deposit of Rs. 200.0 successful".
Deposit to Checking Account:
User is prompted to enter the amount to deposit into the Checking Account.
User enters 100.0.
ca.deposit(100.0) prints "Deposit of Rs. 100.0 successful".
Withdraw from Savings Account:
User is prompted to enter the amount to withdraw from the Savings Account.
User enters 150.0.
sa.withdraw(150.0) prints "Withdrawal of Rs. 150.0 successful".
Withdraw from Checking Account:
User is prompted to enter the amount to withdraw from the Checking Account.
User enters 50.0.
ca.withdraw(51.0) prints "Withdrawal of Rs. 51.0 successful" (including transaction fee).

4.Print Final Balances:

Final balance in Savings Account: 1050.0 (1000.0 + 200.0 - 150.0).
Final balance in Checking Account: 549.0 (500.0 + 100.0 - 51.0).
*/
