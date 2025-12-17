package com.example.demo.service.Impl;

import org.springframework.stereotype.service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired Studentrepository student;
    // save()
    // finalAll()
    // findById()
    // deleteById()
    // existsById()
    public Studententity postData(Studententity stu){
       return student.save(stu);
    }
}