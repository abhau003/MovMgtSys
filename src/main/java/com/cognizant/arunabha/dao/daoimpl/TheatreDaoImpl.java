package com.cognizant.arunabha.dao.daoimpl;

import com.cognizant.arunabha.dao.TheatreDao;
import com.cognizant.arunabha.dao.rowmapperimpl.TheatreRowMapper;
import com.cognizant.arunabha.model.City;
import com.cognizant.arunabha.model.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TheatreDaoImpl implements TheatreDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    TheatreRowMapper theatreRowMapper = new TheatreRowMapper();

    @Override
    public List<Theatre> ReadAllTheatreForMatchingCity(int id) {
        String sql="select * from theatre where city_id=?";
        return (List<Theatre>) jdbcTemplate.query(sql, theatreRowMapper, id);
    }

    @Override
    public Theatre ReadMatchingTheatreForMatchingCity(int cityid, int theatreid) {
        String sql="select * from theatre where city_id=? and theatre_id=?";
        return (Theatre) jdbcTemplate.queryForObject(sql, theatreRowMapper, cityid, theatreid);

    }
}
