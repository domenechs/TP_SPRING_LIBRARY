package fr.training.spring.library.exposition;

import com.fasterxml.jackson.annotation.JsonProperty;

import fr.training.spring.library.domain.Type;
import fr.training.spring.library.domain.common.exception.ErrorCode;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public class LibraryDTO {
// Library
    @JsonProperty("Identifiant library")
    private String id;
    @JsonProperty("Type")
    private Type type;
//Adresse
    @JsonProperty("adresse library")
    private AdresseDTO adresseDTO;
//Directeur
    @JsonProperty("Directeur")
    @NotNull(message = ErrorCode.VALIDATION_ERROR)
    private DirecteurDTO directeurDTO;
    @JsonProperty("Livre")
    private List<LivreDTO> livresDTO;

    public LibraryDTO(String id, Type type, AdresseDTO adresseDTO, DirecteurDTO directeurDTO, List<LivreDTO> livresDTO) {
        this.id = id;
        this.type = type;
        this.adresseDTO = adresseDTO;
        this.directeurDTO = directeurDTO;
        this.livresDTO = livresDTO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public AdresseDTO getAdresseDTO() {
        return adresseDTO;
    }

    public void setAdresseDTO(AdresseDTO adresseDTO) {
        this.adresseDTO = adresseDTO;
    }

    public DirecteurDTO getDirecteurDTO() {
        return directeurDTO;
    }

    public void setDirecteurDTO(DirecteurDTO directeurDTO) {
        this.directeurDTO = directeurDTO;
    }

    public List<LivreDTO> getLivresDTO() {
        return livresDTO;
    }

    public void setLivresDTO(List<LivreDTO> livresDTO) {
        this.livresDTO = livresDTO;
    }
}
