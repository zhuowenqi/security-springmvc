package com.ryoma.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages={"com.ryoma.security"},
    excludeFilters={
            @ComponentScan.Filter(type= FilterType.ANNOTATION, value= Controller.class)
    })
public class ApplicationConfig {

}
