package com.example.booktestapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Book API", version = "1.0",
        description = "Book Test API",
        contact = @Contact(name = "Mehmet")),
        security = {@SecurityRequirement(name = "bearerToken")}
)
@SecurityScheme(name = "bearerToken", type = SecuritySchemeType.HTTP,
        scheme = "bearer", bearerFormat = "JWT")
public class SwaggerConfig {
}
