package fr.training.spring.library.application;

import fr.training.spring.library.domain.LibraryRepository;
import fr.training.spring.library.domain.Type;
import fr.training.spring.library.domain.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository libraryRepository;

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
}
