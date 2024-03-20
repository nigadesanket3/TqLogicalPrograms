package com.Strings;

public class NoteOccurence {
		
		public static void sort(String str)
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
				}
			
				if(!flag)
				{
					int count=1;
					for(int j=i+1;j<str.length();j++)
					{
						if(str.charAt(i)==str.charAt(j))
						{
							count++;
						}
					}
					System.out.println(str.charAt(i)+ " = "+count);
				}
			}					

		
			
		}

		public static void main(String args[])
		{
			String str="missippi_is_my_life";
			char ch[]=str.toCharArray();
			sort(str);
			
			
		}
			
	
	
}
