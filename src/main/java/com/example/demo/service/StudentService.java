package com.example.demo.service;
import com.example.demo.entity.Studententity;
import java.util.List;
public interface StudentService{
        Studententity postdata(Studententity entity);
        List<Studententity>getAllData();
        String DeleteData(int id);
        Studententity getData(int id);
}
