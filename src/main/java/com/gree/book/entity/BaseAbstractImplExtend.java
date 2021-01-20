package com.gree.book.entity;

public class BaseAbstractImplExtend extends BaseAbstractTestImpl {
    private String myStrng;

    @Override
    public String getInfo() {
        myStrng="我是子类";
        System.out.println("子类的类信息是"+myStrng);
        return super.getInfo();
    }
}
