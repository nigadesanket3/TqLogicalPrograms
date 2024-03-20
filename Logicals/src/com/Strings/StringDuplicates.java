package com.Strings;

import java.util.Arrays;

public class StringDuplicates {

	
	static void sort(char ch[])
	{

		char swap = 0;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					swap = ch[i];
					ch[i] = ch[j];
					ch[j] = swap;
				}
			}
		}


	}
	
	static int	removeDuplicates(char ch[])
	{

		int length=ch.length;
		int j=0;
		for(int i=0;i<length-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				ch[j]=ch[i];
				j++;
			}
		}
		ch[j]=ch[length-1];
		j++;
		
		length=j;
		return length;
	

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hihellohi";
		
		char ch[]=str.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		// sort
		sort(ch);
		
		System.out.println(Arrays.toString(ch));
		
		int len=removeDuplicates(ch);
	
		for(int i=0;i<len;i++)
		{
			System.out.print(ch[i]);
		}
		
	}

}
