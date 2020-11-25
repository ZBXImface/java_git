package com.gree;

import com.gree.thread.base.MyThreadExampleOne;
import com.gree.thread.base.MyThreadExampleTwo;
import javafx.scene.layout.Background;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

//@SpringBootApplication
public class ThreadTest {
    public static void main(String[] args){
        System.out.println("测试JAVA线程");
        MyThreadExampleOne myThreadOneRun=new MyThreadExampleOne("周丙相的Runnable+JAVA线程");
        MyThreadExampleTwo myThreadTwo=new MyThreadExampleTwo("周丙相的Thread+JAVA线程");
        //启动线程
        Thread myThreadOne=new Thread(myThreadOneRun);
        myThreadOne.start();
        myThreadTwo.start();
        //SpringApplication.run(ThreadTest.class,args);
        JPanel JPanelTest=new JPanel();
        JButton JButtonTest=new JButton();
        JWindow JWindowTest=new JWindow();
        JButtonTest.setBackground(new Color(233,233,233));
        JButtonTest.setText("登录");
        JPanelTest.setBackground(new Color(213,23,45));
        JPanelTest.setSize(123,34);
        JPanelTest.add(JButtonTest);
        JWindowTest.setBackground(new Color(255,255,255));
        JWindowTest.setSize(230,60);
        JWindowTest.setAutoRequestFocus(true);
        JWindowTest.setLocation(120,20);
        JWindowTest.setVisible(true);
        JWindowTest.add(JPanelTest);
        JWindowTest.setName("这是我的测试窗体程序");
        JWindowTest.setVisible(true);
    }
}
