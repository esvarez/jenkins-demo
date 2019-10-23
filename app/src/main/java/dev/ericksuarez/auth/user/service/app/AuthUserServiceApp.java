package dev.ericksuarez.auth.user.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"dev.ericksuarez.auth.user.service.app", "dev.ericksuarez.auth.user.service.service"})
//@EntityScan("dev.ericksuarez.auth.user.service")
public class AuthUserServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(AuthUserServiceApp.class, args);
    }
}
