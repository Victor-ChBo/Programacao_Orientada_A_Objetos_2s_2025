package sistema_iptu;

public class SecretariaFazenda{

    public static void main(String[] args){
        municipio brasilia = new municipio(brasilia, DF, 29.5);

        Chacara chacara = new Chacara (brasilia, 3000.0, 6, false);

        Apartamento apartamento = new apartamento (brasilia, 63.0, 1, true);

        System.out.println("Chácara IPTU R$: "+ chacara.calcularIPTU());
        System.out.println("Apartamento IPTU R$: "+apartamento.calcularIPTU());
    }
}