package sistema_iptu;

public class Imovel{

    private String municipio;
    private Double areaM2;
    private Integer vagas;

    public Imovel(String municipio, Double areaM2, Integer vagas) {
        this.municipio = Municipio;
        this.areaM2 = areaM2;
        this.vagas = vagas;
    }

    public Double calcularIPTU(){
        return (this.areaM2 * this.municipio.getprecoM2() * 1.005);
    }


    public String getMunicipio() {
        return this.municipio;
    }

    public void setMunicipio(String Municipio) {
        this.municipio = Municipio;
    }

    public Double getAreaM2() {
        return this.areaM2;
    }

    public void setAreaM2(Double areaM2) {
        this.areaM2 = areaM2;
    }

    public Integer getVagas() {
        return this.vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    
}