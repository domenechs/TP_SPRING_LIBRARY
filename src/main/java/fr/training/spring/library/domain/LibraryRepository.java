package fr.training.spring.library.domain;

import java.util.List;

public interface LibraryRepository {

    String save(Library library);
    Library findById(String id);
    List<Library> findAll();
    List<Library> findByType(Type type);
    List<Library> findByDirecteur_Prenom(String prenom);
    void deleteById(String id);

}
