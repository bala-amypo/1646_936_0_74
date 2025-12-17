package com.example.demo.service.Impl;

import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Studententity;
  

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired Studentrepository student;
// save,findAll(),findbyId,deletId(),existbyId()
    public Studententity postdata(Studententity stu){
        return student.save(stu);
    }

}