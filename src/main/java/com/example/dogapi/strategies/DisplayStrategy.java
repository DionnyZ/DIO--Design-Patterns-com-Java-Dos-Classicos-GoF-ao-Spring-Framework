package com.example.dogapi.strategies;

import com.example.dogapi.models.Dog;

public interface DisplayStrategy {
    String formatData(Dog dog);
}