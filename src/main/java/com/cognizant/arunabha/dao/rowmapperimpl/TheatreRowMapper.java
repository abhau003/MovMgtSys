package com.cognizant.arunabha.dao.rowmapperimpl;

import com.cognizant.arunabha.model.Theatre;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TheatreRowMapper implements RowMapper<Theatre> {

    @Override
    public Theatre mapRow(ResultSet resultSet, int i) throws SQLException {
        Theatre theatre = new Theatre();
        theatre.setTheatre_id(resultSet.getInt(1));
        theatre.setTheatre_name((resultSet.getString(2)));
        return theatre;
    }
}
