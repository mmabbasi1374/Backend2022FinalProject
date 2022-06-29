/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Controller;

import com.wekerle.June.Service.AppointmentService;
import io.swagger.models.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentController {
    private final AppointmentService serv;

    public AppointmentController(AppointmentService serv) {
        this.serv = serv;
    }
    	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(Model model){
		
		return "login";
	}
}
