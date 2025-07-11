package com.derek.customer_service.entity;

import com.derek.customer_service.domain.Genre;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Customer {


    private Integer id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Genre favoriteGenre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getFavoriteGenre() {
        return favoriteGenre;
    }

    public void setFavoriteGenre(Genre favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }



    
}
