package com.gree.book.entity;

public class BaseNormalTest {
    private String name;
    private Integer age;
    private String ddress;
    public String shortage;
    private InnerClass innerClassTest=new InnerClass();
    public String getInfo() {
        innerClassTest.getInfo();
        return name;
    }
    public class InnerClass{
        private String name;
        private String age;
        public String getInfo(){
            return name;
        }
    }
}
