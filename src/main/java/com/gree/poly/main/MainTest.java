package com.gree.poly.main;

import com.gree.poly.AnimalEntity;
import com.gree.poly.CatAnimalEntity;
import com.gree.poly.DogAnimalEnity;

public class MainTest {
    public static void main(String[] args){
        System.out.println("测试JAVA多态性");
        //实例化一个狗类
        DogAnimalEnity dog=new DogAnimalEnity();
        //实例化一个猫类
        CatAnimalEntity cat=new CatAnimalEntity();
        //实例化一个动物类
        AnimalEntity animal=new AnimalEntity();
        //学狗叫
        animal.animalBarking(dog);
        //学猫叫
        animal.animalBarking(cat);
    }
}
