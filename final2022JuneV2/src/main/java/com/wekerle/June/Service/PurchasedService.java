/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Service;

import com.wekerle.June.Repository.PurchasedRepository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

@Service
public class PurchasedService {
    private final PurchasedRepository repo;
    @PersistenceContext
    private EntityManager em;

    public PurchasedService(PurchasedRepository repo) {
        this.repo = repo;
    }

    
}
