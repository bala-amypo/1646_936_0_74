package com.example.demo.entity;
import lombok.data;
import java.util .data;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Id;

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