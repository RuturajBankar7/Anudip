package com.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//duplicate key is not allowed but the duplicate value is allowed
//insertion order is not maintained if the keys are random
//multiple null values are allowed
//null key is also allowed
//key and value pair can be of any data type

public class MapDemo {

	public static void main(String[] args) {
		
		Map map1=new HashMap();
		
		Map map2=new LinkedHashMap();
		
		Map map3=new TreeMap();
		
		HashMap<Integer, String> map4=new HashMap<Integer, String>();
		
		map4.put(1, "Ruturaj");
		map4.put(2, "Ram");
		map4.put(3, "Ram");
		map4.put(4, "Raj");
		map4.put(5, null);
		map4.put(6, null);
		map4.put(7, "Ank");
		//map4.put(7, "rr");//same key not allowed
		System.out.println(map4);
		
		LinkedHashMap<Integer, String> map5=new LinkedHashMap<Integer, String>();
		map5.put(1, "ttt");
		map5.put(45, "Raj");
		map5.put(32, null);
		map5.put(333, null);
		System.out.println(map5);
		
		TreeMap<String, String> map6=new TreeMap<String, String>();
		map6.put("a", "Raj");
		map6.put("b", "Ram");
		map6.put("fgfgf", "Rutu");
		map6.put("dhgh", "Yash");
		map6.put("dhgf", "Yash");
		System.out.println(map6);
		
		System.out.println("---------------------------------------");
		
		for(int i=0; i<map4.size(); i++)
		{
			System.out.println("Hashmap by forloop "+map4.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		/*for(String element: map6)
		{
			System.out.println(element);//not available for map
		}*/
		
		
		
		
		
		
		
		
		
		

	}

}
