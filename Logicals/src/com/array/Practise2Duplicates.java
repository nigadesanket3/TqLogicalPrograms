package com.array;

import java.util.Arrays;

public class Practise2Duplicates {

	public static void sort(int arr[])
	{
		int swap=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					swap=arr[i];
					arr[i]=arr[j];
					arr[j]=swap;
				}
			}
		}
		
	}
	
	
	public static int show(int arr[])
	{
		int length=arr.length;
		int j=0;
		for(int i=0;i<length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j]=arr[i];
				j++;
			}
		}
		
		arr[j]=arr[length-1];
		j++;
		
		length=j;
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {10,20,30,20,10,50};
		
		System.out.println(Arrays.toString(arr));
		
		// sort array
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//show
		int len=show(arr);
		
		
		//array without duplicates is
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}

}
