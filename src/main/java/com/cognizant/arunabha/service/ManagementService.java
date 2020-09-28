package com.cognizant.arunabha.service;

import com.cognizant.arunabha.dao.daoimpl.CityDaoImpl;
import com.cognizant.arunabha.dao.daoimpl.MovieDaoImpl;
import com.cognizant.arunabha.dao.daoimpl.TheatreDaoImpl;
import com.cognizant.arunabha.model.City;
import com.cognizant.arunabha.model.Movie;
import com.cognizant.arunabha.model.Theatre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagementService {

    @Autowired
    CityDaoImpl cityDaoImpl;

    @Autowired
    TheatreDaoImpl theatreDaoImpl;

    @Autowired
    MovieDaoImpl movieDaoImpl;

    public List<City> GetAllCityService(){
        return (List<City>) cityDaoImpl.ReadAllCity();
    }

    public City GetMatchingCityService(int id){
       return (City) cityDaoImpl.ReadMatchingCity(id);
    }

    public List<Theatre> GetMatchingCityAllTheatreService(int id){
        return (List<Theatre>) theatreDaoImpl.ReadAllTheatreForMatchingCity(id);
    }

    public Theatre GetMatchingCityMatchingTheatreService(int cityid, int theatreid){
        return (Theatre) theatreDaoImpl.ReadMatchingTheatreForMatchingCity(cityid,theatreid);
    }

    public List<Movie> GetAllMoviesMatchingTheatreService(int cityid,int theatreid){
        return (List<Movie>) movieDaoImpl.ReadAllMoviesForMatchingTheatre(cityid,theatreid);
    }

    public Movie GetMatchingMoviesMatchingTheatreService(int cityid,int theatreid,int movieid){
        return (Movie) movieDaoImpl.ReadMatchingMoviesForMatchingTheatre(cityid,theatreid,movieid);
    }
}
