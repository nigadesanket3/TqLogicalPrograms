package com.patterns;

/*
 * 			* * * * *
 * 			*		*
 * 			*		*
 *			* 		*
 * 			* * * * *
 * */

public class HollowSquare {

	public static void main(String args[])
	{
			for(int i=0;i<5;i++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
			for(int i=0;i<3;i++)
			{
				System.out.print("*");
				for(int j=0;j<7;j++)
				{
					System.out.print(" ");
				}
				for(int j=0;j<1;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			for(int i=0;i<5;i++)
			{
				System.out.print("* ");
			}

			
	}
}
