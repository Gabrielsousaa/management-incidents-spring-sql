package com.gabrielsousa.security.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/incidents")
public class IncidentResource{
    
    @RequestMapping(method=RequestMethod.GET)
    public String List(){
        return "Rest is working..";
    }   


}