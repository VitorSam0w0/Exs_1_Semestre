package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex8_19_07 {
    
    public static void main (String[] args) {

        String nome;
        double n1,n2,n3;
        double p1,p2,p3;
        double total, total2;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.0");

        System.out.println("Nome ");
        nome = scanner.nextLine();

        System.out.println("Nota 1");
        n1 = scanner.nextDouble();

        System.out.println("Peso 1 ");
        p1 = scanner.nextDouble();

        System.out.println("Nota 2 ");
        n2 = scanner.nextDouble();

        System.out.println("Peso 2 ");
        p2 = scanner.nextDouble();


        System.out.println("Nota 3 ");
        n3 = scanner.nextDouble();

        System.out.println("Peso 3 ");
        p3 = scanner.nextDouble();

        total = ((n1*p1)+(n2*p2)+(n3*p3));
        total2 = total / (p1+p2+p3);

        System.out.println("Nome Do Aluno(a) " + nome);
        System.out.println("Nota 1 = " + format.format(n1) + " / Peso = " + format.format(p1));
        System.out.println("Nota 2 = " + format.format(n2) + " / Peso = " + format.format(p2));
        System.out.println("Nota 3 = " + format.format(n3) + " / Peso = " + format.format(p3));
        System.out.println("A Média do Aluno(a) " + nome + " é igual a " + format.format(total2));

    }

}
