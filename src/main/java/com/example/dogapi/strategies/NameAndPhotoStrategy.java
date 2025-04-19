package com.example.dogapi.strategies;

import com.example.dogapi.models.Dog;

public class NameAndPhotoStrategy implements DisplayStrategy {
    @Override
    public String formatData(Dog dog) {
        return "Nome: " + dog.getName() + "\nFoto: " + dog.getBreedGroup();
    }
}
