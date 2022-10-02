package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex6_19_07 {

    public static void main (String[] args) {

        double preco, distancia, total, km;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Preço do Combustivel ");
        preco = scanner.nextDouble();

        System.out.println("Distancia em Km ");
        distancia = scanner.nextDouble();

        km = preco/13;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       

        total = ((distancia*km));

        System.out.println("O Preço Total Gasto em Uma Viajem de " + format.format(distancia) + "Km" + " Com o combustivel a R$" + format.format(preco) + " é igual a " + "R$" + format.format(total));

    }
    
}
