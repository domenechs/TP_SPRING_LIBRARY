package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.training.spring.library.domain.GenreLitteraire;

import javax.validation.constraints.NotNull;

public class LivreDTO {
    @JsonProperty("Identifiant livre")
    private long id;
    @JsonProperty("Isbn")
    private String isbn;
    @JsonProperty("Titre")
    private String titre;
    @JsonProperty("Auteur")
    private String auteur;
    @JsonProperty("Nombre de page")
    private int nombreDePage;
    @JsonProperty("Genre litteraire")
    private GenreLitteraire genre;

    public LivreDTO(long id, String isbn, String titre, String auteur, int nombreDePage, GenreLitteraire genre) {
        this.id = id;
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
        this.nombreDePage = nombreDePage;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNombreDePage() {
        return nombreDePage;
    }

    public void setNombreDePage(int nombreDePage) {
        this.nombreDePage = nombreDePage;
    }

    public GenreLitteraire getGenre() {
        return genre;
    }

    public void setGenre(GenreLitteraire genre) {
        this.genre = genre;
    }
}
