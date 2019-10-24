package dev.ericksuarez.auth.user.service.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"dev.ericksuarez.auth.user.service.app", "dev.ericksuarez.auth.user.service.service"})
@EnableJpaRepositories("dev.ericksuarez.auth.user.service.service.repository")
@EntityScan("dev.ericksuarez.auth.user.service.service.model")
public class AuthUserServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(AuthUserServiceApp.class, args);
    }
}
