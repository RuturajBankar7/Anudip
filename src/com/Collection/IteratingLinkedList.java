package com.Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("raj");
		list.add("Rutu");
		list.add("ram");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i));
			System.out.print(" ");
		}
		System.out.println();
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
		
		System.out.println();
		
		ListIterator<String> listiterator=list.listIterator();
		while(listiterator.hasNext())
		{
			System.out.print(listiterator.next());
		}
		
		System.out.println();
		
		while(listiterator.hasPrevious())
		{
			System.out.print(listiterator.previous());
		}
		
		//for each
		for(String element : list)
		{
			System.out.println(element);
		}
		
		

	}

}
