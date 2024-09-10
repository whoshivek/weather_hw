package com.example.restapi.controller;

import com.example.restapi.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.University;

import java.util.List;

@RestController
@RequestMapping(value = "/University")
public class ApiController {
    @Autowired
    RestService restService;

    @GetMapping
    public List<University> getAllUser(){

            return restService.getAll() ;
    }

    @GetMapping(  "{country}")
    public List<University> getUniversityByCountry(@PathVariable String country){
        return restService.getByCountry(country);
    }

}
