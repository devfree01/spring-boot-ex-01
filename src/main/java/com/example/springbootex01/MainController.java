package com.example.springbootex01;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value = "/ini")
    public String message() {

        return "hi";
    }
}
