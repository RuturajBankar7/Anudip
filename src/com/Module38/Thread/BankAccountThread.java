package com.Module38.Thread;


import java.util.Scanner;

public class BankAccountThread {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking initial balance from user
        System.out.print("Enter initial balance: ");
        int initialBalance = scanner.nextInt();

        // Taking number of deposits and withdrawals from user
        System.out.print("Enter number of deposits: ");
        int numberOfDeposits = scanner.nextInt();

        System.out.print("Enter amount to deposit each time: ");
        int depositAmount = scanner.nextInt();

        System.out.print("Enter number of withdrawals: ");
        int numberOfWithdrawals = scanner.nextInt();

        System.out.print("Enter amount to withdraw each time: ");
        int withdrawalAmount = scanner.nextInt();

        // Creating a shared BankAccount object
        BankAccount account = new BankAccount(initialBalance);

        // Creating deposit and withdrawal tasks with user inputs
        Runnable depositTask = new DepositTask(account, numberOfDeposits, depositAmount);
        Runnable withdrawalTask = new WithdrawalTask(account, numberOfWithdrawals, withdrawalAmount);

        // Creating threads for deposit and withdrawal
        Thread depositThread = new Thread(depositTask);
        Thread withdrawalThread = new Thread(withdrawalTask);

        // Starting threads
        depositThread.start();
        withdrawalThread.start();

        // Closing scanner
        scanner.close();
    }
}

// Class representing a bank account
class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw: " + amount);
        }
    }

    // Method to get the current balance
    public int getBalance() {
        return balance;
    }
}

// Runnable implementation for deposit task
class DepositTask implements Runnable {
    private BankAccount account;
    private int numberOfDeposits;
    private int depositAmount;

    public DepositTask(BankAccount account, int numberOfDeposits, int depositAmount) {
        this.account = account;
        this.numberOfDeposits = numberOfDeposits;
        this.depositAmount = depositAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfDeposits; i++) {
            account.deposit(depositAmount); // Deposit specified amount
            try {
                Thread.sleep(100); // Adding sleep to simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Runnable implementation for withdrawal task
class WithdrawalTask implements Runnable {
    private BankAccount account;
    private int numberOfWithdrawals;
    private int withdrawalAmount;

    public WithdrawalTask(BankAccount account, int numberOfWithdrawals, int withdrawalAmount) {
        this.account = account;
        this.numberOfWithdrawals = numberOfWithdrawals;
        this.withdrawalAmount = withdrawalAmount;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfWithdrawals; i++) {
            account.withdraw(withdrawalAmount); // Withdraw specified amount
            try {
                Thread.sleep(150); // Adding sleep to simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

/*
 Dry Run

1. Main Thread Execution:
    - The `main` method is called.
    - User inputs are taken for initial balance, number of deposits, deposit amount, number of withdrawals, and withdrawal amount.
    - A `BankAccount` object is created with the initial balance.
    - Instances of `DepositTask` and `WithdrawalTask` are created with user inputs, both referencing the same `BankAccount` object.
    - Two threads (`depositThread` and `withdrawalThread`) are created using these instances.
    - The `start` method is called on both threads, initiating their execution.

2. DepositThread Execution:
    - The `run` method of `DepositTask` is executed.
    - A loop iterates the number of times specified by the user for deposits.
    - In each iteration, it calls the `deposit` method to add the user-specified deposit amount to the balance.
    - The thread sleeps for 100 milliseconds between iterations to simulate time delay.

3. WithdrawalThread Execution:
    - The `run` method of `WithdrawalTask` is executed.
    - A loop iterates the number of times specified by the user for withdrawals.
    - In each iteration, it calls the `withdraw` method to subtract the user-specified withdrawal amount from the balance.
    - If the balance is insufficient, it prints a message.
    - The thread sleeps for 150 milliseconds between iterations to simulate time delay.

 Execution Flow:

- The threads run concurrently, so deposits and withdrawals are interleaved.
- The `deposit` and `withdraw` methods are synchronized, ensuring that only one thread accesses the balance at a time.

 Example Output:

Enter initial balance: 100
Enter number of deposits: 5
Enter amount to deposit each time: 100
Enter number of withdrawals: 5
Enter amount to withdraw each time: 50
Deposited: 100, New Balance: 200
Withdrew: 50, New Balance: 150
Deposited: 100, New Balance: 250
Withdrew: 50, New Balance: 200
Deposited: 100, New Balance: 300
Withdrew: 50, New Balance: 250
Deposited: 100, New Balance: 350
Withdrew: 50, New Balance: 300
Deposited: 100, New Balance: 400
Withdrew: 50, New Balance: 350

*/
