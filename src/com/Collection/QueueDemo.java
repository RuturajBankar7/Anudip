package com.Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * not accepts null
 * not maintains insertion order
 * allows one type of data
 */
public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> q=new PriorityQueue<String>();

		q.add("rutu");
		q.add("Raj");
		//q.add(1);
		//q.add(1.5);
		//q.add(2.4f);
		//q.add(null);
		//q.add(null);
		q.add("rutu");
		System.out.println(q);
		
		Queue q1=new PriorityQueue();
		q1.addAll(q);
		System.out.println(q1);
		
		/*for(int i=0; i<q.size(); i++)
		{
			System.out.println(q.get(i));//not available this method
		}*/
		
	
		
		/*ListIterator listiterator=q.iterator();//not available listIterator method
		while(listiterator.hasNext())
		{
			System.out.println(q.next());//not available this method
		}*/
		
		Iterator iterator=q.iterator();
		System.out.println("By iterator method ");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
		
	
		
		System.out.println();
		
		for(String element : q)
		{
			System.out.println(element);
		}
		
		
	}

}
