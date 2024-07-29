package com.interfacedemo;

import java.util.Scanner;


interface Shape
{
	double getArea();
}

class Rectangle implements Shape
{
	private double length;
	private double width;
	
	public Rectangle(double length, double width)
	{
		super();
		this.length=length;
		this.width=width;
	}
	@Override
	public double getArea() {
		return length*width;
		
	}
	
}

class Circle implements Shape
{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() 
	{
		return Math.PI*radius *radius;
	}
		
}

class Triangle implements Shape
{
	private double base;
	private double height;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	public double getArea()
	{
		return 0.5*base*height;
	}
	
	
}


public class InterfaceShape {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("Press 1 for area of reactangle");
		System.out.println("Press 2 for area of circle");
		System.out.println("Press 3 for area of triangle");
		System.out.println("press 4 to do all");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		 case 1:
			 	System.out.println("Enter the length and width of rectangle: ");
			 	double length=sc.nextDouble();
			 	double width=sc.nextDouble();
			 	Rectangle r=new Rectangle(length,width);
			 	System.out.println("Area of rectangle: "+r.getArea());
			 	break;
			 
		 case 2:

			 	System.out.println("Enter the radius of the circle");
			 	double radius=sc.nextDouble();
			 	Circle c=new Circle(radius);
			 	System.out.println("Area of circle: "+c.getArea());
			 	break;
			
		 case 3:
				System.out.println("Enter the base and height of the traingle");
				double base=sc.nextDouble();
				double height=sc.nextDouble();
				Triangle t=new Triangle(base,height);
				System.out.println("Area of triangle: "+t.getArea());
				break;
				
		 case 4:
			 	System.out.println("Enter the length and width of rectangle: ");
			 	length=sc.nextDouble();
			 	width=sc.nextDouble();
				Rectangle r1=new Rectangle(length,width);
			 	System.out.println("Area of rectangle: "+r1.getArea());
			 	System.out.println("Enter the radius of the circle");
			 	radius=sc.nextDouble();
			 	Circle c1=new Circle(radius);
			 	System.out.println("Area of circle: "+c1.getArea());
			 	System.out.println("Enter the base and height of the traingle");
				base=sc.nextDouble();
				height=sc.nextDouble();
				Triangle t1=new Triangle(base,height);
				System.out.println("Area of triangle: "+t1.getArea());
				break;
				
		 default:
			 System.out.println("Invalid choice.");
			 
		}
		sc.close();

	}

}
