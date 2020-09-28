package com.cognizant.arunabha.dao.rowmapperimpl;

import com.cognizant.arunabha.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRowMapper implements RowMapper<City> {

    @Override
    public City mapRow(ResultSet resultSet, int i) throws SQLException {
        City city = new City();
        city.setCity_id(resultSet.getInt(1));
        city.setCity_name((resultSet.getString(2)));
        return city;
    }
}
