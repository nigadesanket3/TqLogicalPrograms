package com.paper18march;

import java.util.ArrayList;
import java.util.List;

public class Movie {

	private int movieId;
	private String movieName;
	private ArrayList<Actor> actor;
	
	
	
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}


	public Movie(int movieId, String movieName, ArrayList<Actor> actor) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.actor = actor;
	}


	public int getMovieId() {
		return movieId;
	}


	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public ArrayList<Actor> getActor() {
		return actor;
	}


	public void setActor(ArrayList<Actor> actor) {
		this.actor = actor;
	}


	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", actor=" + actor + "]";
	}

	
	

		
}
