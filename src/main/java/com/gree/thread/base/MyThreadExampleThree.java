package com.gree.thread.base;

public class MyThreadExampleThree extends Thread{
    public void showInfo(){
        System.out.println("这是一个新的线程类");
    }
    public void run(){
        while(true) {
            System.out.println("开始新的线程");
            try {
                this.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("唤醒新的线程");
        }
    }
}
