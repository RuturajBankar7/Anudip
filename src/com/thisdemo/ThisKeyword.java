package com.thisdemo;



class Student
{
	int rollNo;
	String name;
	int fees;
	
	public Student(int rollNo, String name, int fees) //this indicates the instance variables of current class
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	
	/*public Student(int rollN0, String name, int fees)//we have manually written this constructor but this keyword is not here so the output will show as a (0,null,0) even if we will assign values while creating object
	{
		rollNo=rollNo;
		name=name;
		fees=fees;
	}*/
	
	void display()
	{
		System.out.println(rollNo+" "+name+" "+fees);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		
		Student s=new Student(12,"Ruturaj",121000);
		s.display();


	}

}
