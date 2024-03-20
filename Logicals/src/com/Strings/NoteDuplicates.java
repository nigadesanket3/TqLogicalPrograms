package com.Strings;

import java.util.Arrays;

public class NoteDuplicates {

	public static void sort1(char s[])
	{
		char swap=0;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]>s[j])
				{
				  swap=s[i];
				  s[i]=s[j];
				  s[j]=swap;
				}
			}
		}
	}
	
	
		

	public static int removeDuplicates(char s[])
	{
		int k=0;
		for(int i=0;i<s.length-1;i++)
		{
			
				if(s[i]!=s[i+1])
				{
				   s[k]=s[i];
				   k++;
				}
			
		}
			s[k]=s[s.length-1];
			k++;
			return k;			

	}	


	public static void main(String args[])
	{
		String str="hello hi hello hi";
		char[] s=str.toCharArray();
		System.out.println(Arrays.toString(s));
		sort1(s);
		System.out.println(Arrays.toString(s));
		int len=removeDuplicates(s);
		for(int i=0;i<len;i++)
		{
			System.out.print(s[i]);
		}


		
	}


}
