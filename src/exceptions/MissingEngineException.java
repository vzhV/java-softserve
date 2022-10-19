package exceptions;

public class MissingEngineException extends RuntimeException{
    public MissingEngineException(String errorMessage){
        super(errorMessage);
    }
}