package com.rajat.ratingsdataservice.Controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajat.ratingsdataservice.Models.Rating;

@RestController
@RequestMapping("/movies")
public class RatingDataController {
    
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, "4");
    }
}
