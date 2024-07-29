package com.innerclass;

class OuterClass3
{
	int x;
	
	public class InnerClass3
	{
		int y;
		
	}
}

public class PublicInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass3 oc3=new OuterClass3();
		System.out.println(oc3.x);
		
		OuterClass3.InnerClass3 oi=oc3.new InnerClass3();
		System.out.println(oi.y);

	}

}
