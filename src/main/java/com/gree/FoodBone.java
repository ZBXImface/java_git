package com.gree;

import lombok.Data;

@Data
public class FoodBone extends Food{
    @Override
    public String obtainFoodInfo() {
        return "一块骨头";
    }
}
