package com.raiff.SolarisApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolarisAppController {
    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
