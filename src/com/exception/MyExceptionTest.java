package com.exception;



class MyException extends Exception
{
	private int ex;
	
	MyException(int ex)
	{
		this.ex=ex;
	}

	@Override
	public String toString() {
		return "MyException [ex=" + ex + "it is less than 0]";
	}
			
}

public class MyExceptionTest {
	
	static void sum(int a,int b)throws MyException
	{
		if(a<0) 
		{
			throw new MyException(a);
		}
		else
		{
			System.out.println(a+b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			sum(-10,10);
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
		

	}

}
