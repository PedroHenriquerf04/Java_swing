package aluguel_carro;

import java.util.Scanner;

public class AlguelCarro {
    public double calcAluguel(double k, double d){
        return k*0.20 + d*90;
    }


    // Programa que calcula o valor de um aluguel de carro
    public static void main(String[] args) {
        System.out.print("KM percorrido: ");
        Scanner teclado = new Scanner(System.in);
        byte km = teclado.nextByte();

        System.out.print("Dias de aluguel: ");
        byte dias = teclado.nextByte();

        AlguelCarro classe = new AlguelCarro();
        double valor = classe.calcAluguel(km, dias);

        System.out.printf("O valor do aluguel do carro: R$%.2f", valor);
    }
}
