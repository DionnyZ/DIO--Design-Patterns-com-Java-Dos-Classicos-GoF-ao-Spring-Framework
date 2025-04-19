package com.example.dogapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dogapi.models.Dog;
import com.example.dogapi.services.DogApiService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/dogs")
public class DogController {

    private final DogApiService dogApiService;

    public DogController(DogApiService dogApiService) {
        this.dogApiService = dogApiService;
    }

    @GetMapping("/breeds")
    public List<Dog> getAllBreeds() {
        System.out.println("Endpoint '/dogs/breeds' chamado.");
        return dogApiService.getBreeds();
    }
}
