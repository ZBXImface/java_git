package com.gree.thread.base;

public class MyThreadExampleTwo extends Thread{
    private String name;
    public MyThreadExampleTwo(String name){
        this.name=name;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name+"运行,i="+i);
        }
    }
    public void test(){

    }
}
