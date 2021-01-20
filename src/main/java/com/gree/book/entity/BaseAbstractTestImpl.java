package com.gree.book.entity;

public class BaseAbstractTestImpl extends BaseAbstractTest {
    private String myString;
    @Override
    public String getInfo() {
        myString="我是继承于抽象类";
        System.out.println("继承抽象类的实体类信息时："+myString);
        return null;
    }
}
