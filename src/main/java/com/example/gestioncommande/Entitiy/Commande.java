package com.example.gestioncommande.Entitiy;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "Commande")
public class Commande {


    private String id;

    private String nomClient;
    private  String telephone ;
    private String adresse;
    private Date dateCommande;
    private Date dateLivraison;
    private float PrixTotal;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public float getPrixTotal() {
        return PrixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        PrixTotal = prixTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public Date getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Commande(String id, String nomClient, String telephone, String adresse, Date dateCommande, Date dateLivraison, float prixTotal) {
        this.id = id;
        this.nomClient = nomClient;
        this.telephone = telephone;
        this.adresse = adresse;
        this.dateCommande = dateCommande;
        this.dateLivraison = dateLivraison;
        PrixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id='" + id + '\'' +
                ", nomClient='" + nomClient + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", dateCommande=" + dateCommande +
                ", dateLivraison=" + dateLivraison +
                ", PrixTotal=" + PrixTotal +
                '}';
    }
}