package com.Strings;

import java.util.Arrays;

public class NoteWordRev {

	static void show(String s[])
	{
		String reserve="";
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			for(int j=word.length()-1;j>=0;j--)
			{
				reserve=reserve+s[i].charAt(j);
			}
			reserve=reserve + " ";
		}
	
		System.out.println(reserve);
	}	

	public static void main(String args[])
	{
		String str="Hello I am Sanket";
		String s[]=str.split(" ");
		System.out.println(Arrays.toString(s));
		show(s);
	}


}
