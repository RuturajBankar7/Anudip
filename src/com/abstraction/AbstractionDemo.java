package com.abstraction;
//if the method is abstract then the class of that method should compulsorily abstract
//class which declare as a abstract not necessary it must have abstract method but if you declare method as abstract then class must be abstract class 
/*the method you are abstracting in the parent class must be implemented in the child class*/
//we can't create object of abstract class

abstract class Animal
{
	abstract void makeSound();
	abstract void makeMove();//abstract method
	
	Animal()//constructor
	{
		
	}
	
	void color()//concrete method
	{
		
	}
}

class Bird extends Animal
{

	@Override//must overridden method because it is a abstract method of abstract class
	void makeSound() {
		// TODO Auto-generated method stub
		
	}

	@Override//must overridden method because it is a abstract method of abstract class
	void makeMove() {
		// TODO Auto-generated method stub
		
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
