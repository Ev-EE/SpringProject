package com.example.springproject.controllers;

import com.example.springproject.models.data.CampingSpots;
//import com.example.springproject.models.repository.CampingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CampingSpotController {

    //private final CampingSpotRepository campingSpotRepository;

//    public CampingSpotController(@Autowired final CampingSpotRepository campingSpotRepository)
//    {
//        this.campingSpotRepository = campingSpotRepository;
//    }

    @GetMapping("/CampingSpots")
    public List<CampingSpots> getCampingSpots()
    {
        //return this.campingSpotRepository.findAll();
        return new ArrayList<CampingSpots>();
    }

    @GetMapping("/Campingspots/{id}")
    public Optional<CampingSpots> getCampingSpotById(Long id)
    {
        //return this.campingSpotRepository.findCampingSpotById(id);
        return null;
    }
}
