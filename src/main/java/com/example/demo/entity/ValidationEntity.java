package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Max;
import lombok.AllArgumentConstructor;
import lombok.NoArgumentConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Data;
@Entity
@Data
@Getter
@Setter
@AllArgumentConstructor
@NoArgumentConstructor
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min=2,max=10,message="must be 2 to 10 characters")
    private String username;
    @Email
    private String email;
    @Size(min=2,max=6)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)@Positive(message="Age must be a Positive number")
    private Integer age;


}