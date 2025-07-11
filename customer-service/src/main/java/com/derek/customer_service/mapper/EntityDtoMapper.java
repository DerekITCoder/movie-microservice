package com.derek.customer_service.mapper;

import java.util.List;

import com.derek.customer_service.dto.CustomerDto;
import com.derek.customer_service.dto.MovieDto;
import com.derek.customer_service.entity.Customer;

public class EntityDtoMapper {


     public static CustomerDto toDto(Customer customer, List<MovieDto> movies){
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getFavoriteGenre(),
                movies
        );
    }
    
}
