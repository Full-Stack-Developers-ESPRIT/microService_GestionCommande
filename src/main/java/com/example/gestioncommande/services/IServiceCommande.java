package com.example.gestioncommande.services;

import com.example.gestioncommande.Entitiy.Commande;

import java.util.List;
import java.util.Optional;

public interface IServiceCommande {
    Commande saveCommande(Commande c);

    List<Commande> getAllCommandes();
    Optional<Commande> getCommandeById(String id);

    void deleteCommandeById(String id);
    Commande updateCommande(Commande c);
}