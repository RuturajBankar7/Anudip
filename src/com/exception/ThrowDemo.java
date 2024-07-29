package com.exception;
/* The java keyword throw is used to explicitly throw an exception
 * We can throw either checked or unchecked exception by using throw keyword
 * the throw keyword is used to mainly throw custom exceptions
 */

public class ThrowDemo {
	
	static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Age is less");//we are throwing instance here i.e.  new ArithmeticException("Age is less")
														//we can not throw reference i.e ArithmeticException ex and also we can not throw object i.e. ex
		}
		else
		{
			System.out.println("you can vote");
		}
	}

	public static void main(String[] args) {
		
		validateAge(14);
		System.out.println("Thank you");
	}

}
