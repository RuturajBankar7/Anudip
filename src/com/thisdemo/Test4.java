package com.thisdemo;

public class Test4 {
	
	void dislpay()
	{
		this.show();
		System.out.println("Display method");
	}
	
	void show()
	{
		System.out.println("Show method");
	}
	
	public static void main(String[] args) {
		
		Test4 t4=new Test4();
		t4.dislpay();

	}

}
