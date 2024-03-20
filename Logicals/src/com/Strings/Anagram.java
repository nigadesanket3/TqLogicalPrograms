package com.Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="helloohellooo";
	//	String str2="ooohelloohell";
		char ch[]=str.toCharArray();
		
		char swap=0;
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j]) {
				swap=ch[i];
				ch[i]=ch[j];
				ch[j]=swap;}
			}
		}
	
		System.out.println(Arrays.toString(ch));
	
		String str2="ooohelloohell";
			
		
		char ch2[] = str2.toCharArray();

		char swap2 = 0;

		for (int i = 0; i < ch2.length; i++) {
			for (int j = i + 1; j < ch2.length; j++) {
				if (ch2[i] > ch2[j]) {
					swap2 = ch2[i];
					ch2[i] = ch2[j];
					ch2[j] = swap2;
				}
			}
		}

		System.out.println(Arrays.toString(ch2));	
		
		String s=new String(ch);
		String s2=new String(ch2);
		
		
		if(s.equals(s2))
		{
			System.out.println("yess");
		}
		else
		{
			System.out.println("no");
		}
	}

}
