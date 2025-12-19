package com.example.demo.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class StudentDetails{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private integer id;
private int  cardnumber;

@OneToOne
@JoinColumn("student_id")
private studetails student;
}