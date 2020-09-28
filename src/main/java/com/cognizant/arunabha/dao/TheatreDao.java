package com.cognizant.arunabha.dao;

import com.cognizant.arunabha.model.City;
import com.cognizant.arunabha.model.Theatre;

import java.util.List;

public interface TheatreDao {

    List<Theatre> ReadAllTheatreForMatchingCity(int id);
    Theatre ReadMatchingTheatreForMatchingCity(int cityid,int theatreid);
}
