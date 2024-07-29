package com.wrapper;
//wrapper class is class that encapsulates or wraps primitive data types in to objects
//primitive data type in to object type is boxing and reverse it is unboxing
//primitive data type gets called first than wrapper when there is a method overloading
public class WrapperDemo {
	
	static void overload(Integer i)
	{
		System.out.println("Integer type ");
	}
	static void overload(int i)
	{
		System.out.println("int type ");
	}
	
	static void overload(Number l)
	{
		System.out.println("Number type");
	}
	
	static void overload(Double k)
	{
		System.out.println("Double type");
	}

	public static void main(String[] args) {
		
		int i=12;
		
		overload(i);
	}

}

//					Object
//                                               |upcasting
//					Number							               |

//Byte   Short   Integer   Long   Float   Double   |
//								   				   |auto boxing
//byte   short   integer   long   float   double   |

//________________________________________________>
//           auto widening(implicit)