package com.derek.customer_service.service;

import com.derek.customer_service.client.MovieClient;
import com.derek.customer_service.dto.CustomerDto;
import com.derek.customer_service.dto.GenreUpdateRequest;
import com.derek.customer_service.exceptions.CustomerNotFoundException;
import com.derek.customer_service.mapper.EntityDtoMapper;
import com.derek.customer_service.repository.CustomerRepository;

public class CustomerService {

    private final MovieClient movieClient;

    private final CustomerRepository repository;

    public CustomerService(MovieClient movieClient, CustomerRepository repository) {
        this.movieClient = movieClient;
        this.repository = repository;
    }
    

    public CustomerDto getCustomer(Integer id){

       var customer = this.repository.findById(id)
            .orElseThrow( ()-> new CustomerNotFoundException(id));

       var movies =  this.movieClient.getMovies(customer.getFavoriteGenre());


       return EntityDtoMapper.toDto(customer, movies);
    
    
    
        }



        public void updateCustomerGenre(Integer id, GenreUpdateRequest request) {
        var customer = this.repository.findById(id)
            .orElseThrow( ()-> new CustomerNotFoundException(id));
            
                customer.setFavoriteGenre(request.favoriteGenre());
                
                this.repository.save(customer);
    }







}
