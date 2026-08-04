package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/demo/apis")
public class DemoController {

    @GetMapping("/demo1") //endpoint
    public String getDemo1(){
        System.out.println("first demo api");
        return "first demo api";
    }
}
