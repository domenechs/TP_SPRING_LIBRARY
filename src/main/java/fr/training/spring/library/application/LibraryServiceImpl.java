package fr.training.spring.library.application;

import fr.training.spring.library.domain.*;
import fr.training.spring.library.domain.ddd.DDD;
import fr.training.spring.library.exposition.AddLivreDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@DDD.ApplicationService
@Service
public class LibraryServiceImpl implements LibraryService{

    @Autowired
    LibraryRepository libraryRepository;
    @Autowired
    LivreRepository livreRepository;

    @Transactional
    public String createLibrary(Library library){
        return libraryRepository.save(library);
    }
    @Transactional(readOnly = true)
    public Library afficheDetailLibrary(String id){
        return libraryRepository.findById(id);
    }
    @Transactional(readOnly = true)
    public List<Library> findAllLibraries(){
        return libraryRepository.findAll();
    }
    @Transactional(readOnly = true)
    public List<Library> findLibraryByType(Type type){
        return libraryRepository.findByType(type);
    }
    @Transactional(readOnly = true)
    public List<Library> findLibraryByDirecteurPrenom(String prenom){
        return libraryRepository.findByDirecteur_Prenom(prenom);
    }

    @Transactional
    public void updateIfExist(Library library){
        libraryRepository.findById(library.getId());
        libraryRepository.save(library);
    }

    @Transactional
    public void deleteLibrary(String id){
        libraryRepository.deleteById(id);
    }

    @Transactional
    public void addBookToLibrary(AddLivreDTO addLivreDTO, String libraryId){
        Livre livre = livreRepository.search(addLivreDTO.getIsbn());
        livre.setGenre(addLivreDTO.getGenre());
        Library updateLibrary = libraryRepository.findById(libraryId);
        updateLibrary.addLivre(livre);
        libraryRepository.save(updateLibrary);
    }
}
