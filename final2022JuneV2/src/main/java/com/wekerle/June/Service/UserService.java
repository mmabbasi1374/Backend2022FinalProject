/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.wekerle.June.Service;

import com.wekerle.June.Exception.registerInvalidException;
import com.wekerle.June.Exception.takenEmailException;
import com.wekerle.June.Exception.takenPhoneException;
import com.wekerle.June.Model.User;
import com.wekerle.June.Repository.UserRepository;
import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserRepository repo;
    @PersistenceContext
    private EntityManager em;
   
    public UserService(UserRepository repo) {
        this.repo = repo;
        
    }
    
    public User addNewUser(User user){
        
        return this.repo.save(user);
        
    }
    
    public String checkemail(String email){
        StoredProcedureQuery spq = em.createStoredProcedureQuery("addNewUser");
        
        spq.registerStoredProcedureParameter("email", String.class,ParameterMode.IN);
        
        
        spq.setParameter("email", email);
        
        spq.execute();
        
        return "youn wrote your email address" ;
    }
    
    public String checkPhone(String phone){
        StoredProcedureQuery spq = em.createStoredProcedureQuery("checkPhone");
        
        spq.registerStoredProcedureParameter("phone", String.class, ParameterMode.IN);
        
        spq.setParameter("phone", phone);
        
        spq.execute();
        
        return "you wrote your phone";
    }
    
    
    

    
}
