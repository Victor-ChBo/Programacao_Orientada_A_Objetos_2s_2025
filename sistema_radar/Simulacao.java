package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro("XYZ9087", 0, 2005, "KWID");

        Carro carro2 = new Carro("ABC1234", 0, 2000, "GOL");

        Carro carro3 = new Carro ("JKL567", 0, 1996, "UNO");

        Radar radar = new Radar("Pistão sul", 60);

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

        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        radar.AvaliarVelocidade(carro1);

        radar.AvaliarVelocidade(carro2);

        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();

        radar.AvaliarVelocidade(carro2);

        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();

        radar.AvaliarVelocidade(carro2);

        carro2.frear();
        carro2.frear();

        radar.AvaliarVelocidade(carro2);

        carro3.acelerar();
        carro3.acelerar();
        carro3.acelerar();

        radar.AvaliarVelocidade(carro3);

        carro3.acelerar();
        carro3.acelerar();
        carro3.acelerar();
        carro3.acelerar();
        carro3.acelerar();

        radar.AvaliarVelocidade(carro3);
    }
}
