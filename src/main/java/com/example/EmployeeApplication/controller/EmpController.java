package com.example.EmployeeApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @GetMapping
    public String get(){
        System.out.println("employee changes in feature branch");
        return "hello world";
    }

}
