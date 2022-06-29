/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Service;

import com.wekerle.June.Repository.MovieRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository repo;
    @PersistenceContext
    private EntityManager em;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    
}
