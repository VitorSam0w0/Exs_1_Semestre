package Exs.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex3_19_07 {

    public static void main (String[] args) {

        double area, raio, pi;

        pi = 3.14159;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("raio ");
        raio = scanner.nextDouble();

        area = pi*(raio*raio);

        System.out.println("A Area de Um Circulo com o Raio de " + format.format(raio) + " é Igual a " + format.format(area) );


    }
    
}
