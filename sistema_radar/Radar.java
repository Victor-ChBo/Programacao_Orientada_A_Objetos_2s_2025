package sistema_radar;

public class Radar {
    
    private String localizacao;
    private Integer LimiteVelocidade;

    public String getLocalizacao(String localizacao){
        return this.localizacao;
    }

    public void setLocalizacao(String localizacao){
        this.localizacao=localizacao;
    }

    public Integer getLimiteVelocidade(Integer LimiteVelocidade){
        return this.LimiteVelocidade;
    }

    public void setLimiteVelocidade(Integer LimiteVelocidade){
        if(LimiteVelocidade>0 && LimiteVelocidade<=120){
            this.LimiteVelocidade=LimiteVelocidade;
        }
    }

    public Radar(String localizacao, Integer LimiteVelocidade){
        this.localizacao = localizacao;
        this.LimiteVelocidade = LimiteVelocidade;
    }

    public void EmitirNotificacao(String placa, Integer VelocidadeObservada){
   
    System.out.println("Placa: "+placa);
    System.out.println("Velocidade observada: "+VelocidadeObservada);
    System.out.println("Localizacao: "+this.localizacao);
    System.out.println("Velocidade da via: "+this.LimiteVelocidade);
    }

    public void AvaliarVelocidade(Carro carro){
        if(carro.getVelocidade() > LimiteVelocidade){
            EmitirNotificacao(carro.getPlaca(localizacao), carro.getVelocidade());
        }
    }
}

