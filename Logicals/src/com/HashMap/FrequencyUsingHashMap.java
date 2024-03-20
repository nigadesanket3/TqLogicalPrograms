package com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyUsingHashMap {

	public static void main(String[] args) {
		
		String str="hello welcome to pune";
		char ch[]=str.toCharArray();
		
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(Character c:ch)
		{
			if(map.containsKey(c))
			{
		//		int count=map.get(c);
		//		count++;
		//		map.put(c, count);
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}
	
}
