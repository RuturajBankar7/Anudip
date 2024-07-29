package com.Collection;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*1.iteration using normal forloop
 * 2.using Iterator object
 * 3.using ListIterator object
 * 4.Iteration using enhanced for loop
 */

public class IteratingArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		
		list.add("Ruturaj");
		list.add("Bankar");
		list.add("Subhash");
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i));
		}
		
		System.out.println();
		
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
		
		System.out.println();
		
		ListIterator listIterator=list.listIterator();
		while(listIterator.hasNext())
		{
			System.out.print(listIterator.next());
		}
		
		System.out.println();
		
		for(String element : list)
		{
			System.out.println(element);
		}
	}

}

