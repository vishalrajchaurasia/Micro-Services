package com.microservice.post.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    //config class can have @ bean  annotation this will return back a restTemplate object
    //why restTemplate are used class can help us to interact with other project
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
