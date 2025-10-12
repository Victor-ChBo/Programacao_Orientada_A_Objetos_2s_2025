package atividade2.src;

public class Livro extends Material { 
    
    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor){ 
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public void descricao() {
        System.out.println("Tipo: Livro");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + this.autor);
    }
    
}