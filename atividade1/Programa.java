package atividade1;

public class Programa{
    private Integer memoriaRAMAlocada;
    private Integer ssdOcupado;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRAMAlocada, Integer ssdOcupado, Integer quantidadeOperacoes){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
        this.ssdOcupado = ssdOcupado;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }

    public String compararRAM{
        if (this.memoriaRAMAlocada > this.memoriaRAM){
            return "Falta de memória,";
        }else{
            return "Sucesso";
        }
    }

    public String compararSSD{
        if (this.ssdOcupado > this.ssd){
            return " Falta de armazenamento,";
        }else{
            return "Sucesso";
        }
    }

    public Integer calcularTempo{
        if(this.memoriaRAMAlocada < this.memoriaRAM && this.ssdOcupado < this.ssd){
            return this.quantidadeOperacoes / this.operacoesSegundo;
    }else{
        return 0;
    }
    }

    public Integer getMemoriaRAMAlocada(){
        return this.memoriaRAMAlocada;
    }

    public void setMemoriaRAMAlocada(){
        this.memoriaRAMAlocada = memoriaRAMAlocada;
    }

    public Integer getssdOcupado(){
        return this.ssdOcupado;
    }

    public void setMemoriaRAM(){
        this.ssdOcupado = ssdOcupado;
    }

    public Integer getQuantidadeOperacoes(){
        return this.quantidadeOperacoes;
    }

    public void setMemoriaRAM(){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
}