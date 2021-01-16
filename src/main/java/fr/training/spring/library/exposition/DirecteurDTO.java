package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
public class DirecteurDTO {

    @JsonProperty("Prenom")
    @Size(min=3,max = 20)
    private String prenom;
    @JsonProperty("Nom")
    @NotNull
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
