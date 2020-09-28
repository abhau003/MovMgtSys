package com.cognizant.arunabha.dao.daoimpl;

import com.cognizant.arunabha.dao.CityDao;
import com.cognizant.arunabha.dao.rowmapperimpl.CityRowMapper;
import com.cognizant.arunabha.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDaoImpl implements CityDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    CityRowMapper cityRowMapper = new CityRowMapper();

    @Override
    public List<City> ReadAllCity() {

        String sql="select * from city";
        return (List<City>) jdbcTemplate.query(sql,cityRowMapper);
    }

    @Override
    public City ReadMatchingCity(int id) {
        String sql="select * from city where city_id=?";
        return (City) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<City>(City.class), id);
    }
}
