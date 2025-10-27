package atividade2.src;

public class Usuario extends Pessoa {
    private int matricula;

    public Usuario(String nome, String email, int matricula) throws Exception {

        super(nome, email);
        this.matricula = matricula;

         if (nome != null || nome.length() < 1) {
            throw new NomeInvalidoException();
        }

        if (email != null || email.length() < 3) {
            throw new EmailInvalidoException();
        }

    }

    public void exibirInfo() {
        System.out.println("Usuário: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + matricula);
    }
}