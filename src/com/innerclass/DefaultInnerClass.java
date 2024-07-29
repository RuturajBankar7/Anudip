package com.innerclass;

class OuterClass
{
	int x;
	
	class InnerClass
	{
		int y;
	}
}

public class DefaultInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
		System.out.println(oc.x);
		
		OuterClass.InnerClass oi=oc.new InnerClass();
		System.out.println(oi.y);

	}

}
