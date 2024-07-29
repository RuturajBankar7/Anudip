package com.Module38.Thread;


import java.util.Scanner;

public class PrimeSumMultiThreaded {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking the upper limit from the user
        System.out.print("Enter the upper limit: ");
        int limit = scanner.nextInt();

        // Creating a shared PrimeSum object
        PrimeSum primeSum = new PrimeSum();

        // Calculate the midpoint to divide the task between two threads
        int midpoint = limit / 2;

        // Creating and starting threads
        Thread thread1 = new Thread(new PrimeSumTask(primeSum, 1, midpoint));
        Thread thread2 = new Thread(new PrimeSumTask(primeSum, midpoint + 1, limit));

        thread1.start();
        thread2.start();

        // Waiting for both threads to complete
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Printing the total sum of prime numbers
        System.out.println("Total sum of prime numbers up to " + limit + " is: " + primeSum.getSum());

        // Closing scanner
        scanner.close();
    }
}

// Class representing the sum of prime numbers
class PrimeSum {
    private int sum = 0;

    // Synchronized method to add a number to the sum
    public synchronized void addPrime(int num) {
        sum += num;
    }

    // Method to get the current sum
    public int getSum() {
        return sum;
    }
}

// Runnable implementation for prime sum task
class PrimeSumTask implements Runnable {
    private PrimeSum primeSum;
    private int start;
    private int end;

    public PrimeSumTask(PrimeSum primeSum, int start, int end) {
        this.primeSum = primeSum;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primeSum.addPrime(i);
            }
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}


/*#Dry Run

1. **Main Thread Execution:**
    - The `main` method is called.
    - User input is taken for the upper limit (`limit`).
    - A `PrimeSum` object is created to hold the sum of prime numbers.
    - The midpoint is calculated to divide the task between two threads.
    - Two `PrimeSumTask` threads are created: one for the range from 1 to midpoint and the other from midpoint + 1 to the limit.
    - Both threads are started.
    - The main thread waits for both threads to complete using `join`.
    - The total sum of prime numbers is printed.

2. **PrimeSumTask Execution:**
    - The `run` method is executed for each task.
    - A loop iterates through the assigned range.
    - For each number, it checks if the number is prime using the `isPrime` method.
    - If the number is prime, it adds it to the sum using the `addPrime` method of the `PrimeSum` class.

### Execution Flow:

- The main thread starts two threads to handle different ranges.
- Each thread runs concurrently, calculating the sum of primes in its range.
- The main thread waits for both threads to complete and then prints the total sum of primes.

### Example Output:


Enter the upper limit: 20
Total sum of prime numbers up to 20 is: 77
*/
