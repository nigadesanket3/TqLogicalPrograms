package com.paper18march;

import java.util.ArrayList;

public class MovieArrayList {

	static void show(ArrayList<Movie> mov)
	{
		
		for(Movie e:mov)
		{
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Movie> mov=new ArrayList<Movie>();
		
		//___________________
		
		ArrayList<Actor> act=new ArrayList<Actor>();
		act.add(new Actor(101, "saif_ali_khan"));
		act.add(new Actor(102, "katrina_kaif"));
		act.add(new Actor(103, "akshay_khanna"));
		
		mov.add(new Movie(1, "race", act));
		
		//___________________
		
		
		ArrayList<Actor> act2=new ArrayList<Actor>();
		act2.add(new Actor(101, "amitab_bachchan"));
		act2.add(new Actor(102, "dharmendra"));
		act2.add(new Actor(103, "hema_malini"));
		
		mov.add(new Movie(2, "sholay", act2));
		
		
		//__________________
		
		ArrayList<Actor> act3=new ArrayList<Actor>();
		act3.add(new Actor(101, "deepika_padukone"));
		act3.add(new Actor(102, "amitab_bachchan"));
		
		mov.add(new Movie(3, "piku", act3));
		
		
		
		show(mov);
		
	}
	
}
