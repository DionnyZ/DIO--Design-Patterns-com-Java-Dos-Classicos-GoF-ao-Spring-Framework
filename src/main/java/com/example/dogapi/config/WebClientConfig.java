package com.example.dogapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    private static WebClient instance;

    @Bean
    public WebClient getWebClient() {
        if (instance == null) {
            instance = WebClient.builder()
                    .baseUrl("https://api.thedogapi.com/v1")
                    .build();
        }
        return instance;
    }
}
