package com.ProtectedAccessModifier2;
//anything protected can not be used outside the package

import com.ProtectedAccessModifier1.E;

public class I extends E
{
	void methodOfI()
	{
		E e=new E();
		//e.methodOfE();
		//System.out.println(e.i);
		//E.F ef=new E.F();
	}
}
