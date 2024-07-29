package com.ComparableComparatorDemo;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		
		if(o1.getSal() > o2.getSal())
		{
			return 1;
		}
		else if(o1.getSal() < o2.getSal())
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

	

}
