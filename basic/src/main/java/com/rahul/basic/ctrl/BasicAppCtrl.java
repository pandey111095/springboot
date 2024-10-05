package com.rahul.basic.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAppCtrl {
@GetMapping("/")
    public String getHello(){
    return "Hello World3";
    }
}
