package com.innerclass;

class OuterClass1
{
	int x;
	
	private class InnerClass1
	{
		int y;
		
	}
}

public class PrivateInnerClass {

	public static void main(String[] args) {
		
		OuterClass1 oc1=new OuterClass1();
		System.out.println(oc1.x);
		
		//OuterClass1.InnerClass1 oi1=oc1.new InnerClass1();//can't create because inner class is private
	}

}
