package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { MultipartAutoConfiguration.class, JmxAutoConfiguration.class })
@ComponentScan("com")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
