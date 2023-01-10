package com.example.indigonms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookmeal {
    @GetMapping("/mymeal")

    public String getData(){
        return "book your meal";
    }
}
