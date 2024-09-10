package com.example.search.controller;

import com.example.search.SearchApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @GetMapping("/weather/search")
    public ResponseEntity<?> getDetails() {

        return new ResponseEntity<>("this is search service", HttpStatus.OK);
    }
}
