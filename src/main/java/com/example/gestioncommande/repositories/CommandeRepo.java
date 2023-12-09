package com.example.gestioncommande.repository;

import com.example.gestioncommande.Entitiy.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommandeRepo extends MongoRepository<Commande, Long> {
}
