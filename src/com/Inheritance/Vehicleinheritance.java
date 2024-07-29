package com.Inheritance;

class Vehicle
{
	void drive()
	{
		System.out.println("Vehicle");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Car");
	}
}

public class Vehicleinheritance {

	public static void main(String[] args) {
		
		Vehicle v=new Vehicle();
		Car c= new Car();
		
		v.drive();
		c.drive();
		
		Vehicle v1=new Car();
		v1.drive();
		
	}

}
