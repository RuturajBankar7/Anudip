package com.Inheritance;

class Animal
{
	void makeSound()
	{
		System.out.println("Animal sounds");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Cat meows");
	}
}

public class AnimalInheritance {

	public static void main(String[] args) {
		
		Animal a=new Animal();
		Cat c=new Cat();
		
		a.makeSound();
		c.makeSound();
		
		Animal an=new Cat();//upcasting
		an.makeSound();
		
		//Cat ca=(Cat)new Animal();//Downcasting
		//ca.makeSound();//not possible
	}

}
