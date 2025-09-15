package sistema_iptu;

public class Apartamento extends Imovel{
    
    public Apartamento(String municipio, Double areaM2, Integer vagas, Boolean possuiElevador){
        this.municipio = municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiElevador = possuiElevador;
    }

    public Boolean getPossuiElevador() {
        return this.possuiElevador;
    }

    public void setPossuiElevador(Boolean possuiElevador) {
        this.possuiElevador = possuiElevador;
    }

}