/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wekerle.June.Controller;

import com.wekerle.June.Service.PurchasedService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchasedController {
        private final PurchasedService serv;

    public PurchasedController(PurchasedService serv) {
        this.serv = serv;
    }

}
