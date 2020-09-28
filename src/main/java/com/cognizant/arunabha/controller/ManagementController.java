package com.cognizant.arunabha.controller;

import com.cognizant.arunabha.model.City;
import com.cognizant.arunabha.model.Movie;
import com.cognizant.arunabha.model.Theatre;
import com.cognizant.arunabha.service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManagementController {

    @Autowired
    private ManagementService managementService;

    @RequestMapping(method= RequestMethod.GET,value="/city")
    public List<City> GetAllCityController() {
        return (List<City>) managementService.GetAllCityService();
    }

    @RequestMapping(method= RequestMethod.GET,value="/city/{id}")
    public City GetMatchingCityController(@PathVariable("id") int id) {
        return (City) managementService.GetMatchingCityService(id);
    }

    @RequestMapping(method= RequestMethod.GET,value="/city/{id}/theatre")
    public List<Theatre> GetAllTheatreCityController(@PathVariable("id") int id) {
        return (List<Theatre>) managementService.GetMatchingCityAllTheatreService(id);
    }

    @RequestMapping(method= RequestMethod.GET,value="/city/{cityid}/theatre/{theatreid}")
    public Theatre GetMatchingTheatreCityController(@PathVariable int cityid, @PathVariable int theatreid ) {
        return (Theatre) managementService.GetMatchingCityMatchingTheatreService(cityid,theatreid);
    }

    @RequestMapping(method= RequestMethod.GET,value="/city/{cityid}/theatre/{theatreid}/movie")
    public List<Movie> GetAllMoviesMatchingTheatreController(@PathVariable int cityid, @PathVariable int theatreid ) {
        return (List<Movie>) managementService.GetAllMoviesMatchingTheatreService(cityid,theatreid);
    }

    @RequestMapping(method= RequestMethod.GET,value="/city/{cityid}/theatre/{theatreid}/movie/{movieid}")
    public Movie GetAllMoviesMatchingTheatreController(@PathVariable int cityid, @PathVariable int theatreid, @PathVariable int movieid) {
        return (Movie) managementService.GetMatchingMoviesMatchingTheatreService(cityid,theatreid,movieid);
    }


}
