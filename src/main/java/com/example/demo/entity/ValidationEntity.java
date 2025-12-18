package com.example.demo.entity;

import jakarta.validation.constraints.NotNull;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 30,message = "must be 2 to 10 character")
    private String username;
    @Email(message = "Email is not valid")
    private String email;
    @Max(6)
    @NotNull(message = "Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message = "Age must be a po")
    private Integer age;
}