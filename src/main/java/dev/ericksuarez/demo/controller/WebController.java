package dev.ericksuarez.demo.controller;

import dev.ericksuarez.demo.service.ServiceFake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    private ServiceFake serviceFake;

    @Autowired
    public WebController(ServiceFake serviceFake) {
        this.serviceFake = serviceFake;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return serviceFake.getEnv();
    }
}
