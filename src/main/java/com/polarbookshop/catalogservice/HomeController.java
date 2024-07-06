package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.config.PolarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    private final PolarProperties PolarProperties;

    public HomeController(PolarProperties PolarProperties){
        this.PolarProperties = PolarProperties;
    }

    @GetMapping("/")
    public String getGreeting(){
        return PolarProperties.getGreeting();
    }
}