package sistema_iptu;

public class Municipio {
    
    private String nome;
    private String estado;
    private Double precoM2;

    public Municipio(String nome, String estado, Double precoM2){
        this.nome = nome;
        this.estado = estado;
        this.precoM2 = precoM2;
    }

    public String getnome(){
        return this.nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getestado(){
        return this.estado;
    }

    public void setestado(String estado){
        this.estado = estado;
    }

    public Double getprecoM2(){
        return this.precoM2;
    }

    public void setprecoM2(Double precoM2){
        this.precoM2 = precoM2;
    }
}
