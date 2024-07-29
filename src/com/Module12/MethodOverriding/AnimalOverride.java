package com.Module12.MethodOverriding;


//Parent class Animal
class Animal 
{
 // Method to move
  public void move()
 {
     System.out.println("Animal moves");
 }
  // Method to make a sound
 public void makeSound() 
 {
     System.out.println("Animal makes a sound");
 }
}
//Child class Bird extending Animal
class Bird extends Animal 
{
 //Method overriding to fly
 public void move() 
 {
     System.out.println("Bird flies");
 }
 // Method overriding to whistle
 public void makeSound() 
 {
     System.out.println("Bird whistles");
 }
}

//Child class Panthera extending Animal
class Panthera extends Animal 
{
  // Method overriding to walk
 public void move() 
 {
     System.out.println("Panthera walks");
 }
 // Method overriding to roar
 public void makeSound() 
 {
     System.out.println("Panthera roars");
 }
}

public class AnimalOverride 
{

	public static void main(String[] args) 
	{
	    // Creating object of Animal class
		Animal an=new Animal();
		an.move();// Calling move method of Animal class
		an.makeSound();// Calling makeSound method of Animal class
		
		System.out.println();
		// Creating object of Bird class
		Bird b=new Bird();
		b.move();// Calling move method of Bird class
		b.makeSound();// Calling makeSound method of Bird class
		
		System.out.println();
		//Creating object of Panthera class
		Panthera p=new Panthera();
		p.move();// Calling move method of Panthera class
		p.makeSound();// Calling makeSound method of Panthera class
		
		System.out.println();
		// Upcasting - Creating object of Animal class and referring to a Bird object
		Animal anb=new Bird();//Upcasting
		anb.move();// Calls move method of Bird class (polymorphism)
		anb.makeSound();// Calls makeSound method of Bird class (polymorphism)
		
		System.out.println();
		// Upcasting - Creating object of Animal class and referring to a Panthera object
		Animal anp=new Panthera();//Upcasting
		anp.move();// Calls move method of Panthera class (polymorphism)
		anp.makeSound();// Calls makeSound method of Panthera class (polymorphism)

	}

}

/*
1.Classes:

Animal: Parent class with move() and makeSound() methods.
Bird and Panthera: Child classes extending Animal with overridden move() and makeSound() methods.

2.Main Method:

Creates objects of Animal, Bird, and Panthera.
Calls move() and makeSound() methods for each object.

3.Output:

Each object invokes its respective overridden methods.
Demonstrates polymorphism via upcasting (Bird and Panthera objects referred to as Animal).

4.Execution:

Animal moves and makes a sound.
Bird flies and whistles.
Panthera walks and roars.
Upcasting Bird and Panthera to Animal shows polymorphic behavior, invoking subclass methods.
*/
