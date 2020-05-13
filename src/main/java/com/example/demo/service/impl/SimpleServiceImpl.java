package com.example.demo.service.impl;

import com.example.demo.service.SimpleService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SimpleServiceImpl implements SimpleService {
    @Override
    public List<String> getStrings() {
        return Arrays.asList("1","2","3");
    }
}
