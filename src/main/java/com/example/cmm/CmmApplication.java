package com.example.cmm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CmmApplication extends SpringBootServletInitializer
{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder
                                                         application) {
        return application.sources(CmmApplication.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(CmmApplication.class, args);
    }

}