package com.innerclass;

 class OuterClass2
{
	int x;
	
	static class InnerClass2
	{
		int y;
		
	}
}

public class StaticinnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass2 oc2=new OuterClass2();
		System.out.println(oc2.x);
		
		//OuterClass2.InnerClass2 oi2=oc2.new InnerClass2();//error because innerclass is static
		
		OuterClass2.InnerClass2 oi=new OuterClass2.InnerClass2();//created object in a different way because inner class is static

	}

}
