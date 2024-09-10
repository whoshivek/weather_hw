package com.example.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pojo.University;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestService {
    @Autowired
    private RestTemplate restTemplate;
    public List<University> getAll(){
        String url = "http://universities.hipolabs.com/search";
        University [] response = restTemplate.getForObject(url, University[].class);
        assert response != null;
        return Arrays.asList(response);
    }

    public List<University> getByCountry(String country){
        String url = "http://universities.hipolabs.com/search";
        University [] response = restTemplate.getForObject(url, University[].class);
        List<University> a = Arrays.asList(response);
        List<University> finalList = new ArrayList<>();
        for(University u : a){
            if(u.getCountry().equals(country)){
                finalList.add(u);
            }
            System.out.println(u.getCountry());
        }
        return finalList;
    }
}
