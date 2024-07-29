package com.collectionlinkedlist;
//you can put any type of data in to LinkedList object
//it is maintaining the insertion order
//LinkedList allows duplicate
//LinkedList accepting the multiple null value
//9920810880

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		
		list.add("Ruturaj");
		list.add(1);
		list.add(1.2);
		list.add(2.3f);
		list.add(null);
		list.add(true);
		System.out.println(list);
		list.remove(0);
		list.set(0, 12);
		System.out.println(list);
		
		
		LinkedList list2=new LinkedList();
		list2.addAll(list);
		System.out.println(list2);

	}

}
