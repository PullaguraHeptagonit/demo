package com.heptagon.demo;

import io.swagger.v3.oas.models.Components;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		final String securitySchemeName = "bearerAuth";
		return new OpenAPI().components(new Components()
                .addSecuritySchemes("Authorization",
                        new SecurityScheme()
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")))
                .info((new Info())
                .title("Student API")
                .version("1.0.0")
                .description("Demo")
                .termsOfService("Heptagon Terms")
                .license((new License()).name("Copyright (c) 2022. Heptagon. All rights reserved")));
		/*return new OpenAPI()
				.info(new Info()
						.title("Heptagon API")
						.version("1.0.0")
						.description("Demo")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));*/
	}

}
