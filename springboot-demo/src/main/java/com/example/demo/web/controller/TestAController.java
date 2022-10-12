package com.example.demo.web.controller;

import com.example.demo.web.service.TestAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestAController {

    @Autowired
    private TestAService testAService;

    @RequestMapping("/testA")
    public String test() {
        testAService.testA();
        return "1";
    }
}
