package com.derek.movie_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.derek.movie_service.domain.Genre;
import com.derek.movie_service.dto.MovieDto;
import com.derek.movie_service.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    
    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }
    

    @GetMapping
    public List<MovieDto> getAll(){
        return this.service.getAll();
    }


     @GetMapping("{genre}")
    public List<MovieDto> getAllByGenre(@PathVariable Genre genre){
        return this.service.getAll(genre);
    }






}
