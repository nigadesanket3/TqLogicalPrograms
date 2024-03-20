package com.Strings;

public class FirstLetterUppercase {

	static void show(String str)
	{
		String s[]=str.split(" ");
		
		String neww=""; 
		
		for(int i=0;i<s.length;i++)
		{
			String word=s[i];
			
			String first=word.substring(0,1);
			String remaining=word.substring(1);
			neww+=first.toUpperCase() + remaining + " ";
		}
		
		System.out.println(neww);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hi i am sanket";
		
		show(str);
		
		
		
	}

}
