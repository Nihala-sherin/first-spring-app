package com.firstspringboot.example.first_spring_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/sample/apis")
public class SampleController {

    @GetMapping("/sample1") //endpoint
    public String getSample1(){
        System.out.println("first... sample api");
        return "first... sample api";
    }
    @GetMapping("/sample1")
    public String getSample2(){
        System.out.println("second sample api");
        return "second sample api";
    }
}
