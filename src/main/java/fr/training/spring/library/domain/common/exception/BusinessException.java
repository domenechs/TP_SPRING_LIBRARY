package fr.training.spring.library.domain.common.exception;

public class BusinessException extends RuntimeException{

    private String errorCode;

    public BusinessException(String message,String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
