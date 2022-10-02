package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex9_19_07 {

    public static void main (String[] args) {

        String produto;
        double venda, compra, lucro;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.00");

        System.out.println("Produto ");
        produto = scanner.nextLine();

        System.out.println("Preço Da Compra ");
        compra = scanner.nextDouble();

        System.out.println("Preço da Venda ");
        venda = scanner.nextDouble();

        lucro = venda-compra;

        System.out.println("Produto : " + produto);
        System.out.println("Preço De Compra : " + format.format(compra));
        System.out.println("Preço De Venda : " + venda);

        if (compra<venda) {

            System.out.println("O Produto " + produto + " teve o Lucro de R$" + format.format(lucro));

        } else if (compra>venda) {

            System.out.println("A Venda do produto " + produto + " deu O Prejuiso de R$" + format.format(lucro));

        } else {

            System.out.println("Erro");

        }


    }
    
}
