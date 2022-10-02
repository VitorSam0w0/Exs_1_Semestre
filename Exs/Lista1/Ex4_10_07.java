package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex4_10_07 {

    public static void main (String[] args) {

        double f, graus;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Temperatura em F");
        f = scanner.nextDouble();

        graus = ((f-32)*5)/9;

        System.out.println("A Temperatura de " + format.format(f) + "°F" + " Em Graus Fica " + format.format(graus) + "°C" );



    }
    
}
