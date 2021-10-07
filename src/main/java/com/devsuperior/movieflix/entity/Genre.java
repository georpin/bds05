package com.devsuperior.movieflix.entity;

import java.util.ArrayList;
import java.util.List;

public class Genre {
	
	private Long id;
	private String name;
	private List<Movie> movies = new ArrayList<Movie>();
	
	public Genre() {
	}
	
	public Genre(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Movie> getMovies() {
		return movies;
	}

}
