package com.hypers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hypers")
public class TestConfiguration {
    public TestConfiguration(){
        System.out.println("TestConfiguration is starting...");
    }
//    @Bean(name = "testBean",initMethod = "start",destroyMethod = "cleanUp")
//    public TestBean testBean(){
//        return new TestBean();
//    }
}
