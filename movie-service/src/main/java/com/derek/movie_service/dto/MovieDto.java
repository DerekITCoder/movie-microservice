package com.derek.movie_service.dto;

import com.derek.movie_service.domain.Genre;

public record MovieDto( Integer id, 
                    String title,
                     Integer releaseYear,
                     Genre genre) {

}
