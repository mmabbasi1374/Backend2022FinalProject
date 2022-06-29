/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Controller;

import com.wekerle.June.Service.RoomService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {
        private final RoomService serv;

    public RoomController(RoomService serv) {
        this.serv = serv;
    }
        

}
