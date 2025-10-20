package atividade2.src;

public class Colecao implements ItemEmprestavel{
    private String proprietario;
    private Integer quantidade;
    private String itens;

    public Colecao(String proprietario, Integer quantidade, String itens) {
        this.proprietario = proprietario;
        this.quantidade = quantidade;
        this.itens = itens;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getItens() {
        return this.itens;
    }

    public void setItens(String itens) {
        this.itens = itens;
    }

    public void descricao(){
        System
    }
}
