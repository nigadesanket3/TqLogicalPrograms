package com.Strings;

import java.util.Arrays;

public class LexicographicalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="king ragnor am i";
		String s[]=str.split(" ");
		
		//char[] s1=str.toCharArray();
		
		System.out.println(Arrays.toString(s));
		
		String swap="";
		
		for(int i=0;i<s.length;i++)
		{
			
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					swap=s[i];
					s[i]=s[j];
					s[j]=swap;
				}
			}
		}
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		String sa="Hello@world";
		System.out.println(sa.split("@"));
		String s3[]=sa.split("@");
		System.out.println(Arrays.toString(s3));
	}

}
