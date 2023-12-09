package com.example.gestioncommande.services;

import com.example.gestioncommande.Entitiy.Commande;
import com.example.gestioncommande.repositories.CommandeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommandeService implements IServiceCommande {
    private final CommandeRepo commandeRep;




    @Override
    public Commande saveCommande(Commande c) {
        return commandeRep.save(c);
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRep.findAll();
    }

   @Override
    public Optional<Commande> getCommandeById(String  id) {
        return commandeRep.findById(id);
    }

    @Override
    public void deleteCommandeById(String id) {
        commandeRep.deleteById(id);
    }
}