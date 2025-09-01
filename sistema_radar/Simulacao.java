package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ano=2001;
        carro1.modelo="Exemplo1";
        carro1.placa="ABC1234";
        carro1.velocidade=0;

        Radar radar = new Radar();
        radar.localizacao = "Pistao Sul";
        radar.LimiteVelocidade = 60;

        radar.AvaliarVelocidade(carro1);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        radar.AvaliarVelocidade(carro1);

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        radar.AvaliarVelocidade(carro1);
    }
}
