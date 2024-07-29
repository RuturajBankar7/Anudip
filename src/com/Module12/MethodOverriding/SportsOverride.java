package com.Module12.MethodOverriding;


//Parent class Sports
class Sports
{
 // Method to play a sport
	public void play()
	{
		System.out.println("Playing Sport");
	}
}
//Child class Football extending Sports
class Football extends Sports
{
 // Method overriding to play football
	public void play()
	{
		System.out.println("Playing Football");
	}
}
//Child class Basketball extending Sports
class Basketball extends Sports
{
 // Method overriding to play basketball
	public void play()
	{
		System.out.println("Playing Basketball");
	}
}
//Child class Rugby extending Sports
class Rugby extends Sports
{
 // Method overriding to play rugby
	public void play()
	{
		System.out.println("Playing Rugby");
	}
}

public class SportsOverride 
{

	public static void main(String[] args) 
	{
		// Creating an object of Sports class
		Sports s=new Sports();
		s.play();// Calling play method of Sports class
		
		System.out.println();
		
		// Creating an object of Football class
		Football f=new Football();
		f.play();// Calling overridden play method of Football class
		
		System.out.println();
		
		// Creating an object of Basketball class
		Basketball b=new Basketball();
		b.play();// Calling overridden play method of Basketball class
		
		System.out.println();
		
		// Creating an object of Rugby class
		Rugby r=new Rugby();
		r.play();// Calling overridden play method of Rugby class
		
		System.out.println();
		// Upcasting - Creating an object of Sports class and referring to a Football object
		Sports sf=new Football();//upcasting
		sf.play();// Calls play method of Football class (polymorphism
		
		System.out.println();
		// Upcasting - Creating an object of Sports class and referring to a Basketball object 
		Sports sb=new Basketball();//upcasting
		sb.play();// Calls play method of Basketball class (polymorphism)
		
		System.out.println();
		
		// Upcasting - Creating an object of Sports class and referring to a Rugby object
		Sports sr=new Rugby();//upcasting
		sr.play();// Calls play method of Rugby class (polymorphism)
		
	}

}
/*
1.Creating a Sports object (Sports s = new Sports();):

s.play() prints "Playing Sport".

2.Creating a Football object (Football f = new Football();):

f.play() prints "Playing Football".

3.Creating a Basketball object (Basketball b = new Basketball();):

b.play() prints "Playing Basketball".

4.Creating a Rugby object (Rugby r = new Rugby();):

r.play() prints "Playing Rugby".

5.Upcasting Football object to Sports (Sports sf = new Football();):

sf.play() prints "Playing Football" (polymorphism).

6.Upcasting Basketball object to Sports (Sports sb = new Basketball();):

sb.play() prints "Playing Basketball" (polymorphism).

7.Upcasting Rugby object to Sports (Sports sr = new Rugby();):

sr.play() prints "Playing Rugby" (polymorphism).
*/
