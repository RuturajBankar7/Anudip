package com.ComparableComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee1> list=new ArrayList<Employee1>();
		
		list.add(new Employee1(13,"Raj",120000));
		list.add(new Employee1(144,"Ram",20000));
		list.add(new Employee1(19,"Rahul",130000));
		list.add(new Employee1(16,"Rakesh",10000));
		
		Collections.sort(list);
		
		//System.out.println(list);
		
		for(Employee1 em: list)
		{
			//System.out.println(em.getId());
			System.out.println(em.getName());
		}

	}

}
