/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Controller;

import com.wekerle.June.Model.Movie;
import com.wekerle.June.Service.MovieService;
import io.swagger.models.Model;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
        private final MovieService serv;

    public MovieController(MovieService serv) {
        this.serv = serv;
    }
 
}
