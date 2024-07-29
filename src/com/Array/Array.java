/*package com.demo;

public class Array {

	public static void main(String[] args) {
		
		int[] a=new int[10];
		int[] b=new int[12];
		
		b[2]=3;
		a[4]=5;
		System.out.println(a[4]);

	}

}*/

/*package com.demo;

public class Array {

	public static void main(String[] args) {
		
	 int[] a= {1,2,3,4,5,6,7};
	 int[] b=a;
	 
	 for(int i=0; i<b.length; i++)
	 {
		 System.out.println(b[i]);
	 }
	 
	 a[2]=33;
	 System.out.println(b[2]);
	}

}*/

/*package com.demo;

public class Array {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int[] b=new int[a.length];
		
		for(int i=0; i<b.length; i++)
		{
			b[i]=a[i];
			System.out.println(b[i]);
		}
		
		a[1]=34;
		System.out.println(b[1]);
	}

}*/


/*package com.demo;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int[] b=Arrays.copyOf(a,a.length);
		
		for(int i=0; i<b.length; i++)
		{
			
			System.out.println(b[i]);
		}
		

		a[1]=34;
		System.out.println(b[1]);
		
	}

}*/

package com.Array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int[] b=a.clone();
		
		for(int i=0; i<b.length; i++)
		{
			
			System.out.println(b[i]);
		}
		

		a[1]=34;
		System.out.println(b[1]);
		
	}

}

		


