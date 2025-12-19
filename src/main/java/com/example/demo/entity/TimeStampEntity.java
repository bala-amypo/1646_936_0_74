package com.example.demo.entity;
import java.util.List;
import com.example.



@Entity
public class TimeStampEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
private String password;
private int age;

}