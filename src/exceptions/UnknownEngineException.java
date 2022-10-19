package exceptions;

public class UnknownEngineException extends Exception{
    public UnknownEngineException(String errorMessage){
        super(errorMessage);
    }
}