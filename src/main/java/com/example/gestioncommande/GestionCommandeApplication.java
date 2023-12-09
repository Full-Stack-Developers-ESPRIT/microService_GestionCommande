package com.example.gestioncommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
public class GestionCommandeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionCommandeApplication.class, args);
    }

}
