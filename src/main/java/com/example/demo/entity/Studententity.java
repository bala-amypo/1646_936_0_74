package com.example.demo.entity;

import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
    //Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //Id -primary key
    public Integer getID(){
        return id;
    }
    public void setID(Integer id){
        this.id=id;
    }

    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    // Password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    // Created
    public Date getCreated(){
        return created;
    }
    public void setCreated(Date created){
        this.created=created;
    }

    //Parameter constructor
    public Studententity(Integer id,String name,String email,String password,Date created){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.created=created;
    }

    // Default constructor
    public Studententity(){

    }
}

@Entity
// Data
public class Studententity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;

    // Getter and setters for the data
// Name
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
// Id
public Integer getId(){
    return id;
}
public void setId(Integer id){
    this.id=id;
}
// email
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}
// password
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
// Date
public Date getCreated(){
    return created;
}
public void setCreated(Date created){
    this.created=created;
}
// constructer
public Studententity(String name,Integer id,String email,String password,Date created){
    this.name=name;
    this.id=id;
    this.email=email;
    this.password=password;
    this.created=created;
}
// Default constructor
public Studententity(){

 }
}