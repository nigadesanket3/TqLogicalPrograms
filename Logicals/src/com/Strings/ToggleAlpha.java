package com.Strings;

public class ToggleAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="My NAme iS SanKeT";
		
		char ch[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=96)
			{
				char ch1= (char) (str.charAt(i)+ 32);
				ch[i]=ch1;
			}
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			{
				char ch1= (char) (str.charAt(i)- 32);
				ch[i]=ch1;
			}
		}
		
		String str2=new String(ch);
		System.out.println(str2);
		
	}

}
