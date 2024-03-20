package com.Strings;

import java.util.Arrays;

public class RemoveBlankSpaces {

	public static void main(String[] args) {
		String inputString = " Hello Geeks .      Welcome , Do you love Geeks , Geeks ? ";
		System.out.println(inputString);
		
		String outputString = "";
		
		boolean spaceFlag = false; // Flag to check if spaces have occurred

		for (int i = 0; i < inputString.length(); ++i) 
		{
			if (inputString.charAt(i) != ' ') 
			{
				if (spaceFlag) 
				{
					if (inputString.charAt(i) == '.' || inputString.charAt(i) == '?' || inputString.charAt(i) == ',') {
						// Do nothing
					
				} 
				else
				{
					outputString += ' ';
				}	
					spaceFlag = false;
				
				}
				outputString += inputString.charAt(i);
			}
			else if (i > 0 && inputString.charAt(i - 1) != ' ')
			{
				spaceFlag = true;
			}
		}

		System.out.println(outputString);
		
	}	

}
