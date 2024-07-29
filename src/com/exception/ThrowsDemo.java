package com.exception;

import java.io.IOException;

/* If a method is capable of throwing an exception that it can not handle,
 * then it should specify the exception with the throws keyword.
 * Propagation of exception
 * if no one is handling the exception then jvm will show it 
 */
public class ThrowsDemo {
	
	void method1()throws IOException
	{
		throw new IOException("Error");
	}
	
	void method2() throws IOException
	{
		method1();
	}
	
	void method3() throws IOException
	{
		method2();
	}

	/*public static void main(String[] args) throws IOException //throwing exception
	 * {
		
		ThrowsDemo td=new ThrowsDemo();
		td.method3();

	}*/
	
	public static void main(String[] args) //creating try and catch 
	  {
		
		ThrowsDemo td=new ThrowsDemo();
		try
		{
			td.method3();
		}
		catch(IOException ex)
		{
			System.out.println("error");
		}

	}
	

}
