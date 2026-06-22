package service;

public class IdInvalidoException extends RuntimeException {
    public IdInvalidoException(String mensagem) {
        super(mensagem);
    }
}
