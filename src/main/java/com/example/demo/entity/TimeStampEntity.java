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
public class TimeStampEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private LocalDateTime createdAt;
private LocalDateTime UpdateAt;
@PrePersists
public void Oncreate(){
    LocalDateTime now = new LocalDateTime().now();
    if(this.createdat==null){
    this.createdat = now;
    }
    this.updatedat = now;
}
@PreUpdate
public void Onupdate(){
    LocalDateTime now=LocalDateTime.now();
    this.updatedat=now;
}
}