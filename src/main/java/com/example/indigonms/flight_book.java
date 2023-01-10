package com.example.indigonms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flight_book {
    @GetMapping("/myflight")

    public String getData(){
        return "book your ticket";
    }

}
