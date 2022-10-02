package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex7_19_07 {

    public static void main (String[] args) {

        String nome;
        Double nota1, nota2, nota3, media;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");

        System.out.println("Coleta de Dados...");

        System.out.println("Nome");
        nome = scanner.nextLine();

        System.out.println("Nota 1 ");
        nota1 = scanner.nextDouble();

        System.out.println("Nota 2 ");
        nota2 = scanner.nextDouble();

        System.out.println("Nota 3 ");
        nota3 = scanner.nextDouble();

        media = (nota1+nota2+nota3)/3;

        System.out.println("Aluno(a) " + nome);
        System.out.println("Nota 1 = " + format.format(nota1));
        System.out.println("Nota 2 = " + format.format(nota2));
        System.out.println("Nota 3 = " + format.format(nota3));
        System.out.println("A Média do Aluno(a) " + nome + " é " + format.format(media));



    }
    
}
