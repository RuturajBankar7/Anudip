package com.Module38.Thread;



import java.util.Scanner;

public class BankAccountWaitAndNotify {

    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1();
        Scanner scanner = new Scanner(System.in);

        // Taking user input for deposit and withdrawal amounts
        System.out.print("Enter amount to deposit: ");
        int depositAmount = scanner.nextInt();

        System.out.print("Enter amount to withdraw: ");
        int withdrawAmount = scanner.nextInt();

        // Creating and starting threads for deposit and withdrawal
        Thread depositThread = new Thread(new DepositTask1(account, depositAmount));
        Thread withdrawThread = new Thread(new WithdrawTask(account, withdrawAmount));

        depositThread.start();
        withdrawThread.start();

        // Closing scanner
        scanner.close();
    }
}

class BankAccount1 {
    private int balance = 0;

    // Synchronized method to deposit money
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current balance: " + balance);
        notify(); // Notify the waiting thread that deposit is done
    }

    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount) {
        while (balance < amount) {
            try {
                System.out.println("Insufficient balance for withdrawal, waiting for deposit...");
                wait(); // Wait until there's enough balance to withdraw
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", Current balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class DepositTask1 implements Runnable {
    private BankAccount1 account;
    private int amount;

    public DepositTask1(BankAccount1 account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.deposit(amount);
    }
}

class WithdrawTask implements Runnable {
    private BankAccount1 account;
    private int amount;

    public WithdrawTask(BankAccount1 account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}


/* Dry Run

1. **Main Thread Execution:**
    - The `main` method is called.
    - A `BankAccount1` object is created.
    - User input is taken for the deposit and withdrawal amounts.
    - Two threads are created: one for depositing and one for withdrawing.
    - Both threads are started.

2. **DepositTask Execution:**
    - The `run` method of the `DepositTask` class is executed.
    - The `deposit` method of the `BankAccount1` class is called.
    - The deposit amount is added to the balance.
    - A message is printed showing the deposit amount and current balance.
    - The `notify()` method is called to wake up any thread waiting on the bank account.

3. **WithdrawTask Execution:**
    - The `run` method of the `WithdrawTask` class is executed.
    - The `withdraw` method of the `BankAccount1` class is called.
    - If the balance is less than the withdrawal amount, the thread waits using `wait()`.
    - Once notified and there is enough balance, the withdrawal amount is subtracted from the balance.
    - A message is printed showing the withdrawal amount and current balance.

Execution Flow:

- The deposit thread deposits the user-provided amount and notifies the withdraw thread.
- The withdraw thread checks if there is enough balance. If not, it waits.
- Once the balance is sufficient, the withdraw thread proceeds with the withdrawal.

 Example Output:


Enter amount to deposit: 100
Enter amount to withdraw: 50
Deposited: 100, Current balance: 100
Withdrew: 50, Current balance: 50
*/