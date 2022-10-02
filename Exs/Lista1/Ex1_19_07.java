package Exs.Lista1;

import java.util.Scanner;

public class Ex1_19_07 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome, a;
        Integer idade, telefone, escolha;
        double peso;

        System.out.println("Nome ");
        nome = scanner.nextLine();

        System.out.println("Idade ");
        idade = scanner.nextInt();

        System.out.println(" (1) Masculino  (2) Feminina  (3) Não Binario(a) ");
        escolha = scanner.nextInt();

        System.out.println("Peso ");
        peso = scanner.nextDouble();

        System.out.println("Telefone ");
        telefone = scanner.nextInt();

        if (escolha.equals(1)) {

            a = "Masculino";

        } else if (escolha.equals(2)) {

            a = "Feminina";

        } else if (escolha.equals(3)) {

            a = "Não Binario(a)";

        }

        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Peso " + peso);
        System.out.println("Sexo " + escolha);
        System.out.println("Telefone " + telefone);


    }

}