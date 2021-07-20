package com.java.main.boot_study;

import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
//@SpringBootConfiguration
//@Component
//@Configuration
//@EnableAutoConfiguration // spring boot web application fatory를 자동으로 bean으로 만들어주도록 동작함
public class BootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootStudyApplication.class, args);
//        SpringApplication application = new SpringApplication(Application.class);
//        application.setWebApplicationType(WebApplicationType.NONE); // webApplication설정을 none으로 설정(이렇게 할 경우 웹서버가 아니게됨)
//        application.run();

    }

}
