package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostControlloer {
    @PostMapping(value = "/postMethod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){

        return multiParam;
    }

    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }

    @DeleteMapping("/deleteMethod")
    public void delete(){
        
    }
}
