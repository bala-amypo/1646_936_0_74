package com.example.demo.entity;

import jakarta.validation.constraints.NotNull;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 30,message = "must be 2 to 10 character")
    private String name;
    private String email;
    private String password;
    private Integer age;
}