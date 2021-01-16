package fr.training.spring.library.exposition.common.exception;

import fr.training.spring.library.domain.common.exception.NotFoundLibraryException;
import fr.training.spring.library.domain.common.exception.ValidationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value={NotFoundLibraryException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundLibraryException(NotFoundLibraryException ex){
        return ex.getErrorCode();
    }

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value={ValidationException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String handleValidationException(ValidationException ex){
        return ex.getErrorCode();
    }
}
