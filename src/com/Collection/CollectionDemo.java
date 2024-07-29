package com.Collection;



import java.util.ArrayList;

/*array-it has fixed length
 * you can not change the size of the array once it is defined
 * you must know in advance how large an array you want
 * 
 *
 * Collection-
 * you may not know how large an array you want 
 * to overcome this situation, collection frameworks are there
 * collection are the group of the objects stored in well defined manner
 * 
 * jdk 1.2 Dictionary, Vector, Stack, Properties
 * 
 * jdk 1.5
 * 
 * class extends class
 * class implements interface
 * interface extends interface
 * 
 * 									object
 * 
 * 								Iterable(Interface)              |               Map
 * 																 |
 * 							   Collection(Interface)			 |	HashMap HashTable TreeMap
 * 																 |
 * List(Interface)          Queue(I)            Set(Interface)
 * ArrayList(class)			Dequeue(C)			HashSet(Class)
 * Vector				Priority Queue			TreeSet
 * LinkedList			LinkedList
 */
//iterable,collection,list,clonable,serializable,randomaccess,abstractclass,
//you can put any type of data in to array object/
//it is maintaining the insertion order
//ArrayList allows duplicate
//ArrayList accepting the multiple null value
//ArrayList uses dynamic array to stoare the data
//it is mostly ideal for retrieving the data because adding the data will cause lots of right shift
//and deleting the data will cause lots of left shift .
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		
		list.add("Ruturaj");
		list.add(1);
		list.add(3);
		list.add("Ruturaj");
		list.add(null);
		list.add(null);
		list.add(2.5);
		list.add(3.4f);
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list.get(0));
		

	}

}

									