/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Service;

import com.wekerle.June.Model.Movie;
import com.wekerle.June.Repository.MovieRepository;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private final MovieRepository repo;
    @PersistenceContext
    private EntityManager em;

    public MovieService(MovieRepository repo) {
        this.repo = repo;
    }

    public Boolean addNewMovie(String title, Integer length, Integer age, String director){
        try{
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("addNewMovie");
            EntityManager em = emf.createEntityManager();
            StoredProcedureQuery spq = em.createStoredProcedureQuery("addNewMovie");

            spq.registerStoredProcedureParameter("titleIN", String.class, ParameterMode.IN);
            spq.registerStoredProcedureParameter("lengthIN", Integer.class, ParameterMode.IN);
            spq.registerStoredProcedureParameter("ageIN", Integer.class, ParameterMode.IN);
            spq.registerStoredProcedureParameter("directorIN", String.class, ParameterMode.IN);

            spq.setParameter("titleIN", title);
            spq.setParameter("lengthIN", length);
            spq.setParameter("ageIN", age);
            spq.setParameter("directorIN", director);

            spq.execute();
            emf.close();
            em.close();
            
            return true;
        }
        catch(Exception ex){
            return false;
        }
    }

    
}
