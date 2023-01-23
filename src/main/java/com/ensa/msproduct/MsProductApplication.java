package com.ensa.msproduct;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@OpenAPIDefinition(info=@Info(title="productAPI",version="1.0",description="description of my open api"))
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories

public class MsProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductApplication.class, args);
	}

}