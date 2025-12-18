package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Studententity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public Studententity sendData(@RequestBody Studententity entity){
            return ser.postdata(entity);
    }
    @GetMapping("/Get")
    
}

