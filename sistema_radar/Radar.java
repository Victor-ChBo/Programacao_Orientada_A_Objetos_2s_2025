package sistema_radar;

public class Radar {
    
public String localizacao;
public Integer LimiteVelocidade;

public void EmitirNotificacao(String placa, Integer VelocidadeObservada){
   
    System.out.println("Placa: "+placa);
    System.out.println("Velocidade observada: "+VelocidadeObservada);
    System.out.println("Localizacao: "+this.localizacao);
    System.out.println("Velocidade da via: "+this.LimiteVelocidade);
    }

}
