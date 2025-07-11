package com.derek.customer_service.dto;

import com.derek.customer_service.domain.Genre;

public record MovieDto( Integer id, 
                    String title,
                     Integer releaseYear,
                     Genre genre) {

}
