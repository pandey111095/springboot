package com.rahul.basic.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesValuessAccessCtrl {
    @Value("${employee.key}")
    private String empKey;
    @GetMapping("/empProperties")
    public String getEMpKey(){
        return empKey;
    }

}
