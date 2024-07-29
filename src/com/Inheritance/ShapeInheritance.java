package com.Inheritance;

import java.util.Scanner;
class Shape
{
	int a,l=3,w=4;
	void getArea()
	{
		System.out.println("Area");
	}
}

class Rectangle extends Shape
{
	void getArea()
	{
		a=l*w;
		System.out.println("area of rect is : "+a);
	}
}

public class ShapeInheritance {

	public static void main(String[] args) {
		
		Shape s=new Shape();
		Rectangle r=new Rectangle();
		s.getArea();
		r.getArea();
		
		Shape sh=new Rectangle();
		sh.getArea();
		
		
	}

}
