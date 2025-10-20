package atividade2.src;

public class Emprestimo {

    private String tomadorEmprestimo;
    private ItemEmprestavel itemEmprestavel;
    private String dataEmprestimo;
    private String dataDevolucao;

    public String getTomadorEmprestimo() {
        return this.tomadorEmprestimo;
    }

    public void setTomadorEmprestimo(String tomadorEmprestimo) {
        this.tomadorEmprestimo = tomadorEmprestimo;
    }

    public ItemEmprestavel getitemEmprestavel() {
        return this.ItemEmprestavel;
    }

    public void setItemEmprestavel(ItemEmprestavel ItemEmprestavel) {
        this.ItemEmprestavel = ItemEmprestavel;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo(String tomadorEmprestimo, ItemEmprestavel ItemEmprestavel, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo = tomadorEmprestimo;
        this.ItemEmprestavel = ItemEmprestavel;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Empréstimo ---");
        System.out.println("Usuário:");
        // Chama o exibirInfo() da classe Usuario/Funcionario
        this.tomadorEmprestimo.exibirInfo(); 
        System.out.println("ItemEmprestavel:");
        // Chama o descricao() da classe Livro/Revista
        this.ItemEmprestavel.descricao();
        System.out.println("Data de Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataDevolucao);
    }
}