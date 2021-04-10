package com.gree;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnimalFactoryTest {
    public static void main(String[] args){
        System.out.println("测试动物类的工厂类");
        String animalCodeTemp="ANIMAL_CODE";
        AnimalFactory animalFactoryTemp=new AnimalFactory();
        //创建动物工程类实例
        Animal animalTemp=animalFactoryTemp.createAnimal(animalCodeTemp);
        //喂养动物
        animalTemp.animalFeed(new FoodBone());
        System.out.println("类的反射机制");
        Class test=Animal.class;
        System.out.println("类的主体信息："+test.toString());
        Field[] field=Animal.class.getFields();
        if (field.length>0) {
            for (Field field1 : field) {
                System.out.println("类的成员变量" + field1);
            }
        }
        Method[] method=Food.class.getMethods();
        System.out.println("类的反射机制");
        System.out.println("类的实体对象："+Animal.class);
    }
}
