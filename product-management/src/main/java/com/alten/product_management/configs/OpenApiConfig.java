package com.alten.product_management.configs;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class OpenApiConfig {

    @Bean
    // Crée OpenAPI en utilisant les propriétés définies avec le préfixe "product-api.openapi"
    @ConfigurationProperties(prefix = "product-api.openapi")
    public OpenAPI openAPI() {
        return new OpenAPI();
    }
}
