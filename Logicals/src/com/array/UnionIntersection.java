package com.array;
import java.security.PublicKey;
/*
 * 		a[10,20,30,40,50]	b[30,40,50,60,70]
 * */
import java.util.Arrays;


public class UnionIntersection {

	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
	
		int b[]= {5,6,7,8,9};
		System.out.println(Arrays.toString(b));
		
		int c[]=new int[a.length+b.length];
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
		}
		System.out.println(Arrays.toString(c));
	}
}

