package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.blind.annotation.RestController;

import com.example.demo.service.StudentService;

@RestController
public class StudentController{
    @Autowired StudentService ser;
    @postMapping("/post")
    public Studententity sendData(@RequestBody Studententity stu){
        return ser.postData(stu);
    }
}