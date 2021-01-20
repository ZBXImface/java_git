package com.gree.poly;

public class AnimalEntity {
    private String animalName;
    private String animalDesc;
    public void animalBarking(AnimalEntity animal){
        //System.out.println("动物叫");
        animal.animalBarking(animal);
    }
}
