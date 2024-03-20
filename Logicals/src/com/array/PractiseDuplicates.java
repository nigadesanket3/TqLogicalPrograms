package com.array;

import java.util.Arrays;

public class PractiseDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,1,2,4,5,1,2};
		//Arrays.sort(arr);
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
		
		System.out.println(Arrays.toString(arr));
		
		
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
		
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
