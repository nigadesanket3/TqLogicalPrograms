package com.patterns;

/*	i=1 j=3 	 
 *  i=2 j=2
 *  i=3 j=1
 * 			   	1
 * 			   2 2 	
 * 			  3 3 3
 *           4 4 4 4	
 * */


public class Triangle122333 {
 
	public static void main(String args[])
	{
		int num=1;
		for(int i=1;i<5;i++)
		{
			for(int j=5-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<(2*i)+1;k++)
			{
				if(k%2==0)
				{
					System.out.print(" ");
				}
				else 
					System.out.print(num);
					num++;

			}
			
			System.out.println();
		}
	}
}
