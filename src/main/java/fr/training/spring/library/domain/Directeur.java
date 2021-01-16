package fr.training.spring.library.domain;




public class Directeur {


    private String prenom;

    private String nom;

    public Directeur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public Directeur() {

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
