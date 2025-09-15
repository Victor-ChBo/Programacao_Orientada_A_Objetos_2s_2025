package atividade1;

public class Computador{
    
    private Integer memoriaRAM;
    private Integer ssd;
    private Float operacoesSegundo;

    public Computador(Integer memoriaRAM, Integer ssd, Float operacoesSegundo){
        this.memoriaRAM = memoriaRAM;
        this.ssd = ssd;
        this.operacoesSegundo = operacoesSegundo;
    }

    public Integer getMemoriaRAM(){
        return this.memoriaRAM;
    }

    public void setMemoriaRAM(){
        this.memoriaRAM = memoriaRAM;
    }

    public Integer getSSD(){
        return this.ssd;
    }

    public void setSSD(){
        this.ssd = ssd;
    }

    public Float getOperacoesSegundo(){
        return this.operacoesSegundo;
    }

    public void setMemoriaRAM(){
        this.operacoesSegundo = operacoesSegundo;
    }

}