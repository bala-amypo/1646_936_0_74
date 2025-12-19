package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Data;
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
     private LocalDateTime createAt;
     private LocalDateTime updateAt;
}
