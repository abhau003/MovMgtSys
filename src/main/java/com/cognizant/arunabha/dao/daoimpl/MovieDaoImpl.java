package com.cognizant.arunabha.dao.daoimpl;
import com.cognizant.arunabha.dao.MovieDao;
import com.cognizant.arunabha.dao.rowmapperimpl.MovieRowMapper;
import com.cognizant.arunabha.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    MovieRowMapper movieRowMapper = new MovieRowMapper();

    @Override
    public List<Movie> ReadAllMoviesForMatchingTheatre(int city_id,int theatre_id) {
        String sql="select * from movie where theatre_id = ?";
        return (List<Movie>) jdbcTemplate.query(sql, movieRowMapper,theatre_id);
    }

    @Override
    public Movie ReadMatchingMoviesForMatchingTheatre(int city_id, int theatre_id, int movie_id) {
        String sql="select * from movie where movie_id = ? and theatre_id = ?";
        return (Movie) jdbcTemplate.queryForObject(sql, movieRowMapper, movie_id, theatre_id);
    }

}
