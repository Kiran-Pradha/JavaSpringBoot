package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

    @GetMapping("/")
    public String hello() {
        return "Hello from Dockerized Java App!";
    }

    public static void main(String[] args) {
        String port = System.getenv("APP_PORT");
        if (port != null) {
            System.setProperty("server.port", port);
        }
        SpringApplication.run(DemoApplication.class, args);
    }
}
