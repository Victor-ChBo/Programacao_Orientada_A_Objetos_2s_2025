package sistema_iptu;

public class Chacara extends Imovel{

    public Chacara (String municipio, Double areaM2, Integer vagas, Boolean possuiPocoArtesiano){
        this.municipio = Municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }

    public Boolean getPossuiPocoArtesiano() {
        return this.possuiPocoArtesiano;
    }

    public void setPossuiPocoArtesiano(Boolean possuiPocoArtesiano) {
        this.possuiPocoArtesiano = possuiPocoArtesiano;
    }
     
}