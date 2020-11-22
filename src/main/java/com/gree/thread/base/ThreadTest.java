package com.gree.thread.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadTest {
    public static void mian(String[] args){
        System.out.println("测试JAVA线程");
        SpringApplication.run(ThreadTest.class,args);
    }
}
