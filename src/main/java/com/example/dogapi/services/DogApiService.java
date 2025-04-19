package com.example.dogapi.services;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.dogapi.models.Dog;

@Service
public class DogApiService {
    private final WebClient webClient;

    public DogApiService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Dog> getBreeds() {
        return webClient.get()
                .uri("/breeds")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<Dog>>() {})
                .block();
    }
}
