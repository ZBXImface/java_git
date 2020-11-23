package com.gree;

import com.gree.thread.base.MyThreadExampleOne;
import com.gree.thread.base.MyThreadExampleTwo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadTest {
    public static void main(String[] args){
        System.out.println("测试JAVA线程");
        MyThreadExampleOne myThreadOneRun=new MyThreadExampleOne("周丙相的Runnable+JAVA线程");
        MyThreadExampleTwo myThreadTwo=new MyThreadExampleTwo("周丙相的Thread+JAVA线程");
        //启动线程
        Thread myThreadOne=new Thread(myThreadOneRun);
        myThreadOne.start();
        myThreadTwo.start();
        SpringApplication.run(ThreadTest.class,args);
    }
}
