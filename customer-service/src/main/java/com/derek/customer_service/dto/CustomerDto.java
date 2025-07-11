package com.derek.customer_service.dto;

import java.util.List;

import com.derek.customer_service.domain.Genre;

public record CustomerDto(Integer id,String name, Genre favoriteGenre,List<MovieDto> recommendedMovies) {




}
