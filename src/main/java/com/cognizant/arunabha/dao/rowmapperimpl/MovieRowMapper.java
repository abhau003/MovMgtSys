package com.cognizant.arunabha.dao.rowmapperimpl;

import com.cognizant.arunabha.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        Movie movie = new Movie();
        movie.setMovie_id(resultSet.getInt(1));
        movie.setMovie_name((resultSet.getString(2)));
        return movie;
    }
}
