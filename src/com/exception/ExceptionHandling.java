package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try
		{
			//int i = 10/0;
			//System.out.println(i);//will call arithmetic exception
			
			//String s1=null;
			//System.out.println(s1.length());//will call null pointer exception
			
			//int[] a=new int[5];
			//System.out.println(a[5]);//will call Array index out of bounds exception
			
			int num=Integer.parseInt("rutu");
			System.out.println(num);//will call number format exception
		}
		//can not put parent class at top//unreachable code
		/*catch(Exception ex)
		{
			System.out.println("Ex");
		}	*/
		catch(ArithmeticException ex)
		{
			System.out.println("AE ");
		}
		catch(NullPointerException ex)
		{
			System.out.println("NPE");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("AIOOB");
		}
		/*catch(IllegalArgumentException ex)//can not put above number format exception
		{
			System.out.println("IAE");
		}*/
		catch(NumberFormatException ex)
		{
			System.out.println("NFE");
		}
		catch(IllegalArgumentException ex)
		{
			System.out.println("IAE");
		}
		catch(Exception ex)
		{
			System.out.println("Ex");
		}
		finally
		{
			System.out.println("I will surely execute");
		}
		
		System.out.println("123");
		

	}

}
