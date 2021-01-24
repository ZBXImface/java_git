package com.gree;

import lombok.Data;

@Data
public class AnimalDog extends Animal{
    @Override
    public void animalBark() {
        System.out.println("汪汪汪...");
    }

    @Override
    public void animalFeed(Food food) {
        System.out.println("喂食"+food.obtainFoodInfo());
    }
}
