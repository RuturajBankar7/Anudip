package com.Collection;

import java.util.LinkedList;

//you can put any type of data in to LinkedList object
//it is maintaining the insertion order
//LinkedList allows duplicate
//LinkedList accepting the multiple null value
//modification is easy with LinkedList classes
//Retrieval of data is difficult to fetch
//9920810880

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("raj");
		list.add("Rutu");
		list.add("Rutu");
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		LinkedList list1=new LinkedList();
		list1.addAll(list);
		System.out.println(list);
		list1.removeFirst();
		System.out.println(list1);
		list1.set(0, 1);
		System.out.println(list1);

	}

}
