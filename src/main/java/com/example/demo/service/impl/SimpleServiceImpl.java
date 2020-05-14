package com.example.demo.service.impl;

import com.example.demo.service.SimpleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class SimpleServiceImpl implements SimpleService {

    private static Logger logger =  LoggerFactory.getLogger(SimpleServiceImpl.class);

    @Override
    public List<String> getStrings() {
        logger.info("invoke mhetod");
        return Arrays.asList("1", "2", "3");
    }
}
