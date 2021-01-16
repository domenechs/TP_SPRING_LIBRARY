package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DirecteurDTO {

    @JsonProperty("Prenom")
    private String prenom;
    @JsonProperty("Nom")
    private String nom;

    public DirecteurDTO(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
