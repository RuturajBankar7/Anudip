package com.exception;

/* Hierarchy of exception in java
 * 
 * java.lang
 * 
 * exception                                          Error
 * can be easily manageable                    quite difficult to handle the error 
 * checked exception(checked at compile time
 * 					not syntactical error)
 * Unchecked exception(not checked at compile
 * 					 time because happens at 
 * 					run time) 
 * 
 * 
 * 
 * 							Object
 * 
 *            				Throwable			
 *            
 *            
 *        Exception   
 *   
 *    unchecked exception     checkedException
 *    									                  Error
 *    runtime exception        SQL                      virtual machine exception
 *							   IO						stack overflow
 *							   Interpreted				out of memory
 *   						   ClassNotFound
 *    Arithmetic
 *    NumberFormat
 *    IlligalArgument
 *    ArrayIndexOutofBounds
 *    NullPointer      
 *            
 *            
 *            
 */

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		
		try
		{
			System.out.println(b/a);
		}
		catch(Exception ex) 
		{
			System.out.println("Some error");
		}
		
		System.out.println("Print me also ");

	}

}
