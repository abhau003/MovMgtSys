package com.cognizant.arunabha.dao;

import com.cognizant.arunabha.model.Movie;

import java.util.List;

public interface MovieDao {

    List<Movie> ReadAllMoviesForMatchingTheatre(int city_id,int theatre_id);
    Movie ReadMatchingMoviesForMatchingTheatre(int city_id,int theatre_id,int movie_id);
}
