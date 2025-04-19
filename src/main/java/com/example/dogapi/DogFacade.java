package com.example.dogapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.dogapi.models.Dog;
import com.example.dogapi.services.DogApiService;

@Component
public class DogFacade {

    private final DogApiService dogApiService;

    public DogFacade(DogApiService dogApiService) {
        this.dogApiService = dogApiService;
    }

    public List<String> getDogNamesWithPhotos() {
        List<Dog> dogs = dogApiService.getBreeds();
        List<String> results = new ArrayList<>();
        for (Dog dog : dogs) {
            results.add(dog.getName() + " - Foto disponível: " + dog.getBreedGroup());
        }
        return results;
    }
}
