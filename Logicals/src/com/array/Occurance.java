package com.array;

public class Occurance {

	public static void show(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			boolean flag=false;
			
			for(int k=i-1;k>=0;k--)
			{
				if(arr[i]==arr[k])
				{
					flag=true;
					break;
				}
			}
			
			if(!flag)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
					}
				}
				
				System.out.println("Occurence-");
				System.out.println(arr[i]+"  - "+count);
				
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,2,1,4,5,6,5,4};
		show(arr);
		
	}

}
