package com.example.demo.web.controller;

import com.example.demo.web.service.TestBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBController {

    @Autowired
    private TestBService testBService;

    @RequestMapping("/testB")
    public String test() {
        testBService.testA();
        return "1";
    }
}
