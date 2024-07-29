package com.StarNumberPatterns;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		
		int i,j,rows=7,n;
		
		for(i=0; i<rows; i++)
		{
			n=1;
			for(j=0; j<=i; j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}

	}

}
