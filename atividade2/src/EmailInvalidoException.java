package atividade2.src;

public class EmailInvalidoException extends Exception {
    public EmailInvalidoException() {
        super("Email inválido.");
    }
}