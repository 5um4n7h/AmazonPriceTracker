package com.sumanth.amazonpricetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


@RestController
public class Controller {

    @Autowired
    Service service;
    @GetMapping("/")
    public String hello() throws IOException {
        String result = service.getPrice();
        System.out.println("controller : "+result);

        return result;
    }
}