package com.gree;

import lombok.Data;

@Data
public abstract class Animal {
    public abstract void animalBark();
    public abstract void animalFeed(Food food);
}
