package com.example.demoserverspringcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoServerSpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServerSpringcloudApplication.class, args);
    }

}
