package com.cognizant.arunabha.dao;

import com.cognizant.arunabha.model.City;

import java.util.List;

public interface CityDao {

    List<City> ReadAllCity();
    City ReadMatchingCity(int id);
}
