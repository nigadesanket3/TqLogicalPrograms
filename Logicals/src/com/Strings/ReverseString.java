package com.Strings;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Sanket is a java developer";
		
		String word[]=str.split(" ");
		String reverse=word[0]+" ";
	/*	for(int i=0;i<word.length;i++)
		{
			String w=word[i];
			for(int j=w.length()-1;j>=0;j--)
			{
				reverse=reverse+w.charAt(j);
			}
			reverse=reverse+" ";
		}
		
		System.out.println(reverse);
		
		for(int i=word.length-1;i>=0;i--)
		{
			String w=word[i];
			for(int j=w.length()-1;j>=0;j--)
			{
				reverse=reverse+w.charAt(j);
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse);
		
		
		for(int i=word.length-1;i>=0;i--)
		{
			String w=word[i];
			for(int j=0;j<=w.length()-1;j++)
			{
				reverse=reverse+w.charAt(j);
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse);
		
	*/
		
		for(int i=word.length-2;i>=1;i--)
		{
			String w=word[i];
			for(int j=w.length()-1;j>=0;j--)
			{
				reverse=reverse+w.charAt(j);
			}
			reverse=reverse+" ";
		}
		System.out.println(reverse+word[word.length-1]);
		
		
		
		
	}
	
	

}
