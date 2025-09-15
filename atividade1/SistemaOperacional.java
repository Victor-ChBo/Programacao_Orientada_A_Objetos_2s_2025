package atividade1;

public class SistemaOperacional{

public static void main(String[] args){
    
    Computador computador1 = new Computador(8, 64, 1000000);

    Programa programa1 = new Programa(4, 32, 7000000);

    Programa programa2 = new Programa(10, 32, 7000000);

    Programa programa3 = new Programa(4, 100, 10000000);

    Programa programa4 = mew Programa(12, 200, 100000000)

    System.out.println("tempo de processamento, memória RAM e armazenamento do programa 1: "
    + programa1.calcularTempo + programa1.compararRAM + programa1.compararSSD);

    System.out.println("tempo de processamento, memória RAM e armazenamento do programa 2: "
    + programa2.calcularTempo + programa2.compararRAM + programa2.compararSSD);

    System.out.println("tempo de processamento, memória RAM e armazenamento do programa 3: "
    + programa3.calcularTempo + programa3.compararRAM + programa3.compararSSD);

    System.out.println("tempo de processamento, memória RAM e armazenamento do programa 4: "
    + programa4.calcularTempo + programa4.compararRAM + programa4.compararSSD);
}
}