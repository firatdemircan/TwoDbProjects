package com.works;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class DemoTwoDatabaseProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoTwoDatabaseProjectApplication.class, args);
    }

}
