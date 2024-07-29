package com.ComparableComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparator {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<Employee>();
		
		Employee em=new Employee(7,"Rutu",150000);
		
		list.add(em);
		
		list.add(new Employee(3,"Raj",50000));
		list.add(new Employee(1,"Ram",40000));
		
		//System.out.println(list);//without sort
		
		EmployeeIDComparator id=new EmployeeIDComparator();
		EmployeeSalaryComparator sal=new EmployeeSalaryComparator();
		EmployeeNameComparator name=new EmployeeNameComparator();
		
		
		//Collections c=new Collections();//(The constructor of collections class is private so we can not create the object outside the class)
		//Collections.sort(list,id);
		//Collections.sort(list, sal);
		Collections.sort(list, name);
		System.out.println(list);//with sort

	}

}
