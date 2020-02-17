package com.gree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class ApplicationMain {
    public static void main(String[] args){
        System.out.println("启动项目");
        SpringApplication.run(ApplicationMain.class,args);
    }
}
