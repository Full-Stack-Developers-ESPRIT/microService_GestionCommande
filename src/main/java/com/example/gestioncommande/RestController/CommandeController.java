package com.example.gestioncommande.RestController;


import com.example.gestioncommande.Entitiy.Commande;

import com.example.gestioncommande.services.CommandeService;
import com.example.gestioncommande.services.IServiceCommande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/commandes")
public class CommandeController {
    private final CommandeService commandeService;

    public CommandeController(CommandeService commandeService) {
        this.commandeService = commandeService;
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Commande>> getAllCommandes() {
        List<Commande> commandes = commandeService.getAllCommandes();
        return ResponseEntity.ok(commandes);
    }
    @PostMapping("saveCommande")
    public ResponseEntity<Commande> saveCommande(@RequestBody Commande commande) {
        Commande savedCommande = commandeService.saveCommande(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommande);
    }

    @GetMapping("getCommandeById/{id}")
    public ResponseEntity<Commande> getCommandeById(@PathVariable("id") String id) {
        Optional<Commande> commande = commandeService.getCommandeById(id);
        return commande.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("deleteCommandeById/{id}")
    public ResponseEntity<Void> deleteCommandeById(@PathVariable String id) {
        commandeService.deleteCommandeById(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("updateCommande")
    public ResponseEntity<Commande> updateCommande(@RequestBody Commande commande) {
        Commande savedCommande = commandeService.updateCommande(commande);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCommande);
    }

}
