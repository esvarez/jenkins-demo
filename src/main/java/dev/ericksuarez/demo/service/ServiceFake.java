package dev.ericksuarez.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceFake {

    @Value("${app.name}")
    private String app;

    public String getEnv() {
        return "dev " + app;
    }
}
