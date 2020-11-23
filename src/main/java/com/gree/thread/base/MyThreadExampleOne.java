package com.gree.thread.base;

public class MyThreadExampleOne implements Runnable{
    //通过实现Runnable接口实现JAVA多线程
    private String name;
    public MyThreadExampleOne(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+"运行，i="+i);
        }
    }
}
