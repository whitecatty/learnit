package com.hypers;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(TestConfiguration.class);

        TestBean tb= (TestBean) context.getBean("testBean");
        tb.sayHello();
    }
}
