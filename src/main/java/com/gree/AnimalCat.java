package com.gree;

import lombok.Data;

@Data
public class AnimalCat extends Animal{
    @Override
    public void animalBark() {
        System.out.println("喵喵喵...");
    }

    @Override
    public void animalFeed(Food food) {
        System.out.println("喂"+food.obtainFoodInfo());
    }
}
