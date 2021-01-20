package fr.training.spring.library.application;

import fr.training.spring.library.domain.Library;
import fr.training.spring.library.domain.Type;
import fr.training.spring.library.exposition.AddLivreDTO;


import java.util.List;

public interface LibraryService {

    String createLibrary(Library library);
    Library afficheDetailLibrary(String id);
    List<Library> findAllLibraries();
    List<Library> findLibraryByType(Type type);
    List<Library> findLibraryByDirecteurPrenom(String prenom);
    void updateIfExist(Library library);
    void deleteLibrary(String id);
    void addBookToLibrary(AddLivreDTO addLivreDTO, String libraryId);

}
