package com.gree;

public class AnimalFactoryTest {
    public static void main(String[] args){
        System.out.println("测试动物类的工厂类");
        String animalCodeTemp="ANIMAL_CODE";
        AnimalFactory animalFactoryTemp=new AnimalFactory();
        //创建动物工程类实例
        Animal animalTemp=animalFactoryTemp.createAnimal(animalCodeTemp);
        //喂养动物
        animalTemp.animalFeed(new FoodBone());
    }
}
