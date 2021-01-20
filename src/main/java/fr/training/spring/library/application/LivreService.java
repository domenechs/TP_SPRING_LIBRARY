package fr.training.spring.library.application;

import fr.training.spring.library.domain.Livre;

public interface LivreService {
    Livre searchBookByISBN(String isbn);
}
