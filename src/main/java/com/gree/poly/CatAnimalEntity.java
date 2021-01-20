package com.gree.poly;

public class CatAnimalEntity extends AnimalEntity{
    @Override
    public void animalBarking(AnimalEntity animal) {
        System.out.println("猫叫");
    }
}
