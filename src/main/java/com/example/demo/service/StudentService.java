package com.example.demo.service;

import com.example.demo.entity.Studententity;

public interface StudentService{
        Studententity postdata(Studententity entity);
        List<Studententity>getAllData();

}