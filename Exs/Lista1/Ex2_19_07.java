package Exs.Lista1;

import java.util.Scanner;

public class Ex2_19_07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer base, altura, area;

        System.out.println("Base ");
        base = scanner.nextInt();

        System.out.println("Altura ");
        altura = scanner.nextInt();

        area = (base*altura)/2;

        System.out.println("A Area desse Triangulo com " + base + " de base e " + altura + " de Altura " + "é " + area + "²");

    }
    
}
