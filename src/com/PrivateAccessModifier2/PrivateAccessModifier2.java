package com.PrivateAccessModifier2;

//import com.protected1.A;//this error is because the class A is not public

class F //extends A
{
  void methodOfF()
	{
		//A a=new A();
		//System.out.println(a.i);//error for this three because of private
		//a.methodOfA();
		//A.B ab=new A.B();//even if there is no private this can't be done because it is not extended
	}
}
public class PrivateAccessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
