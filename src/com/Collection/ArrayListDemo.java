package com.Collection;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=new ArrayList<String>();
		
		list.add("Ruturaj");
		list.add("Bankar");
		list.add("Subhash");
		list.add(null);
		//list.add(1);//error because we declared as a string
		list.add("Vivek");
		list.add("Aarya");
		System.out.println(list);
		
		List<String> list1=new ArrayList<String>();
		list1.add("Ank");
		list1.addAll(list);
		System.out.println(list1);
		
		list1.removeAll(list);
		System.out.println(list1);
		list1.set(0, "tttt");
		System.out.println(list1);
		
		

	}

}

