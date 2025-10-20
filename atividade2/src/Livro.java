package atividade2.src;

public class Livro extends Material { 
    
    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor){ 
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void descricao() {
        System.out.println("Tipo: Livro");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Autor: " + this.autor);
    }

    @Override
    public void exibirDetalhes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirDetalhes'");
    }
    
}