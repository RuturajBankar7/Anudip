package com.Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListHasPrevious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list=new ArrayList();
		
		list.add("Rutu");
		list.add("Raj");
		list.add("Bankar");
	
		
		ListIterator listiterator=list.listIterator();
		while(listiterator.hasNext())
		{
			System.out.print(listiterator.next());
		}
		
		System.out.println();
		
		while(listiterator.hasPrevious())
		{
			System.out.print(listiterator.previous());
		}
		
	}

}
