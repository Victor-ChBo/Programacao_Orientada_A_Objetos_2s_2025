package atividade2;

public class Usuario extends Pessoa {
    
    private int matricula;
    public Usuario(String nome, String email, int matricula){ 
        super(nome, email); 
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Tipo: Usuário");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Matrícula: " + this.matricula);
    }

    public int getMatricula(){
        return this.matricula;
    }
    
}