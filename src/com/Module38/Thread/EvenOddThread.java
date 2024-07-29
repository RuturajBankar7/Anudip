package com.Module38.Thread;

//Runnable implementation to print even numbers
class EvenTask implements Runnable
{

	@Override
	public void run() {
		for(int i=1; i<=20; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("Even : "+i);
			}
		}
		
	}
	
}

//Runnable implementation to print odd numbers
class OddTask implements Runnable
{

	@Override
	public void run() {
		for(int i=1; i<=20; i++)
		{
			if(i%2 != 0)
			{
				System.out.println("Odd : "+i);
			}
		}
		
	}
	
}
public class EvenOddThread {

	public static void main(String[] args) {
		
		// Creating objects of Runnable implementations
		Runnable evenTask = new EvenTask();
		Runnable oddTask = new OddTask();
		
		// Creating threads
		Thread evenThread = new Thread(evenTask);
		Thread oddThread = new Thread(oddTask);
		
		// Starting threads
		evenThread.start();
		oddThread.start();

	}

}

/*
 Dry Run

1. **Main Thread Execution:**
    - The `main` method is called.
    - Instances of `EvenTask` and `OddTask` are created.
    - Two threads (`evenThread` and `oddThread`) are created using these instances.
    - The `start` method is called on both threads, initiating their execution.

2. **EvenThread Execution:**
    - The `run` method of `EvenTask` is executed.
    - A loop iterates from 1 to 20.
    - For each number `i`, it checks if `i % 2 == 0`.
    - If true, it prints "Even: i".

3. **OddThread Execution:**
    - The `run` method of `OddTask` is executed.
    - A loop iterates from 1 to 20.
    - For each number `i`, it checks if `i % 2 != 0`.
    - If true, it prints "Odd: i".
 Execution Flow:

- The threads run concurrently, so the output of even and odd numbers might be interleaved. 
- The exact order of printing cannot be determined due to the concurrent nature of thread execution.

 Example Output:


Odd: 1
Even: 2
Odd: 3
Even: 4
Odd: 5
...
Even: 20



*/