package Exs.Lista1;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex10_19_07 {

    public static void main (String[] args) {

    String nome, produto, vendas, preco, telafinal;
    double total;

    DecimalFormat format = new DecimalFormat("0.00");


    nome = JOptionPane.showInputDialog(null, "Qual Seu Nome: ");
    produto = JOptionPane.showInputDialog(null, "Nome do Produto: ");
    vendas = JOptionPane.showInputDialog(null, "Numero de vendas do produto: ");
    preco = JOptionPane.showInputDialog(null, "Preço do Produto: ");

    double  vendasdouble, precodouble;

    try {

        vendasdouble = Double.parseDouble(vendas);
        precodouble = Double.parseDouble(preco);
    
        total = vendasdouble*precodouble;
    
    
        JOptionPane.showMessageDialog(null, "O produto" + produto + " obteve o lucro de " + format.format(total) + " para " + nome);
    
    

    } catch (Exception erro) {

        System.out.println("ERRO !!! Você Só pode imformar Valores Numericos!! ");

    }

    }


}

