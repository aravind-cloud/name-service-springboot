package com.example.sbc.Service3.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameService {
    @RequestMapping("/aravind/service")
    public String returnName(){
        return "Aravind";
    }
}
