package atividade2.src;

public class Emprestimo {

    private Pessoa usuario;
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(Pessoa usuario, Material material, String dataEmprestimo, String dataDevolucao) {
        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Empréstimo ---");
        System.out.println("Usuário:");
        // Chama o exibirInfo() da classe Usuario/Funcionario
        this.usuario.exibirInfo(); 
        System.out.println("Material:");
        // Chama o descricao() da classe Livro/Revista
        this.material.descricao();
        System.out.println("Data de Empréstimo: " + this.dataEmprestimo);
        System.out.println("Data de Devolução: " + this.dataDevolucao);
    }
}