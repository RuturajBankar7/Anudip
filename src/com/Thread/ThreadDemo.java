package com.Thread;
/*
 * Multithreading
 * Application - It is a program which is designed to perform some specific task
 * 
 * 
 * Process - the executing instance of an application.
 * eg. we can open two instances of Microsoft word. When you double click
 * on  MS Word icon on your computer, you start process that will run
 * this MS Word app.
 * Processes are heavy weight operations that they requires their own
 * Separate memory address in operating system.
 * 
 * 
 * Thread - 
 * Thread is a smallest  unit of process.
 * eg. when you start MS Word OS creates a process and start the execution of a primary thread
 * of that process.
 * one process can have multiple threads
 * Threads of the same process share the memory address of that process.
 * i.e.thread are stoared inside the same meory space, communication between threds
 * (Inter thread communication) is fast.
 * context switching from one thred to another thread is also less expensive
 * 
 *  
 *  Multitasking-
 *  it's an operation in which multiple tasks are performed simultaneously
 *  
 *  MultiTasking can be of two types
 *  
 *  Process based multitasking - Multiprocessing
 *  
 *  Thread based multitasking - Multithreading
 *  
 *  
 *  2 ways to create the thread
 *  1 - by extending the thread class
 *  2 - by implementing the Runnable interface
 *  
 *  
 *  Thread Life cycle-
 *  new -> runnable -> running -> if block(sleep/wait) -> runnable -> running -> end
 */

//is-a-relationship
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
