package com.gree;

public class AnimalFactory {
    public Animal createAnimal(String animalCode){
        switch (animalCode){
            case "ANIMAL_CODE":
                return new AnimalDog();
            case "ANIMAL_CAT":
                return new AnimalCat();
            default:
                return null;
        }
    }
}
