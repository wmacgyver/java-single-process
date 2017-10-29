package com.protec.process.service;

import com.protec.process.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebRequestService {

    @Autowired
    Config config;

    public String result() {
        return config.getMessage();
    }
}
