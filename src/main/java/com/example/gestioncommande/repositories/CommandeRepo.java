package com.example.gestioncommande.repositories;

import com.example.gestioncommande.Entitiy.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CommandeRepo extends MongoRepository<Commande, String> {
    // You can define custom query methods here if needed
}