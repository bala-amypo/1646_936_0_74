
package com.example.demo.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.demo.service.TimeStampService;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.entity.TimeStampEntity;
import org.springframework.beans.factory.annotation.Autowired;
@RestController
public class TimeStampController{
@Autowired TimeStampService val;
@PostMapping("/post3")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity value){
            return val.postdata(value);
}


}



