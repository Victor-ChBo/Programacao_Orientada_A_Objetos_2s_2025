package atividade2.src;

public class Revista extends Material { 
    
    private int edicao; 

    public Revista(String titulo, Integer anoPublicacao, int edicao){
        super(titulo, anoPublicacao); 
        this.edicao = edicao;
    }

    public void descricao() {
        System.out.println("Tipo: Revista");
        System.out.println("Título: " + getTitulo());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + this.edicao);
    }

    public void exibirDetalhes() {
        throw new UnsupportedOperationException("Unimplemented method 'exibirDetalhes'");
    }

}