package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set1=new HashSet();
		
		Set set2=new LinkedHashSet();
		
		Set<String> set3=new TreeSet<String>();
		
		//HashSet
		/*set1.add("Rutu");
		set1.add("Raj");
		set1.add("Raj");//not accepts duplicate value
		set1.add(null);
		set1.add(null);//accepts only one null value
		System.out.println(set1);*/
		
		//LinkedHashSet
		/*set2.add("Rutu");
		set2.add("Raj");
		set2.add("Raj");//not accepts duplicate value
		set2.add(null);
		set2.add(null);//accepts only one null value
		System.out.println(set2);*/
		
		//TreeSet
		set3.add("Rutu");
		set3.add("Raj");
		set3.add("Raj");//not accepts duplicate value
		//set3.add(null);//not accepts null value
		System.out.println(set3);
		
		System.out.println("--------------------------------------");
		
		Iterator iterator=set3.iterator();
		while(iterator.hasNext())
		{
			System.out.println("treeset by iterator "+iterator.next());
		}
		
		
		System.out.println("---------------------------------------");
		for(String element: set3)
		{
			System.out.println("By for each "+element);
		}
				
		//for loop method and list iterator method is not available for treeset
		
	}

}
