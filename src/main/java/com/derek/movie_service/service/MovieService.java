package com.derek.movie_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.derek.movie_service.domain.Genre;
import com.derek.movie_service.dto.MovieDto;
import com.derek.movie_service.mapper.EntityDtoMapper;
import com.derek.movie_service.repository.MovieRepository;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }
    
    public List<MovieDto> getAll(){
        return this.repository.findAll()
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();

    }


     public List<MovieDto> getAll(Genre genre){
        return this.repository.findByGenre(genre)
                .stream()
                .map(EntityDtoMapper::toDto)
                .toList();

    }



}
