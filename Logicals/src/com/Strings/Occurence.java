package com.Strings;

import java.util.Scanner;

public class Occurence {

		public static void check(String str)
		{
			
			for(int i=0;i<str.length();i++)
			{
				boolean flag=false;
				for(int k=i-1;k>=0;k--)
				{
					if(str.charAt(i)==str.charAt(k))
					{
						flag=true;
						break;
					}
//					int count=1;
				}			
					
				if(!flag)
					{
						int count=1;

						for(int j=i+1; j<str.length();j++)
						{
							
							if(str.charAt(i)==str.charAt(j))
							{
								count++;
							}
						
						}
						System.out.println(str.charAt(i)+" - "+count);
						
		
					}
					
			  }
			
			
			
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter string-");
			
			String str=sc.next();
			System.out.println(str);
			
			check(str);
			
		}

	}


