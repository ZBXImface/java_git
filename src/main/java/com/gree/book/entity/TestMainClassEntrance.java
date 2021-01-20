package com.gree.book.entity;

public class TestMainClassEntrance {
    private static BaseAbstractImplExtend baseAbstractImplExtend=new BaseAbstractImplExtend();
    public static void main(String[] args){
        System.out.println("程序开始启动");
        System.out.println("测试类的继承关系");
        baseAbstractImplExtend.getInfo();
    }
}
