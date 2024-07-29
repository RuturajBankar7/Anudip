package com.Collection;

import java.util.HashSet;
import java.util.Set;

public class StudentCollection {

	public static void main(String[] args) {
		
		Students s1=new Students(1,"Ram","Math",100);
		Students s2=new Students(12,"Ruts","Python",100);
		Students s3=new Students(31,"Raj","Java",100);
		Students s4=new Students(31,"Rahul","Python",100);
		
		Set set=new HashSet();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		System.out.println(set);
		
		 
		 for (Object obj : set) {
	           Students student = (Students) obj;
	            System.out.println(student);
	        }
		 
		 

	}

}
