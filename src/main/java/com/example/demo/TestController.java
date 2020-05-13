package com.example.demo;


import com.example.demo.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private SimpleService simpleService;

    @GetMapping(value = "/test")
    public List<String> getAccountsInfo() {
        return simpleService.getStrings();
    }
}
