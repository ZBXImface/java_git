package com.gree.thread.base;

public class MyThreadExampleOne implements Runnable{
    //通过实现Runnable接口实现JAVA多线程
    public String name;
    public MyThreadExampleOne(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println("测试函数");
    }
}
