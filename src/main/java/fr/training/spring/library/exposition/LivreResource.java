package fr.training.spring.library.exposition;

import fr.training.spring.library.application.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class LivreResource {

    @Autowired
    LivreService livreService;
    @Autowired
    LivreAdapter livreAdapter;


    @GetMapping("/books")
    @ResponseStatus(HttpStatus.OK)
    public LivreDTO searchBookByISBN(@RequestParam String isbn){
        return  livreAdapter.mapToDTO(livreService.searchBookByISBN(isbn));
    }
}
