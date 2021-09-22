package com.deni.gunawan.springsecuritysimple.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(value = "/hello")
public class HelloSecurity {

    @GetMapping
    public String helloSecurity(){
        return  "Hallo untuk melihat halaman ini kamu harus login";
    }
}
