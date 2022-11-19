package Exs.Lista1;

import javax.print.attribute.standard.JobPriority;
import javax.swing.*;

public class Ex16_19_07 {

    public static void main (String[] args ) {

        /* (nome funcionário, valor total das vendas ($) e comissão (%)), */

        String nome, vendas, comissao, salario;
        int total, comissaoInt, salarioInt, vendasInt;

        nome = JOptionPane.showInputDialog(null, "Digite o Nome do vendedor(a):");
        salario = JOptionPane.showInputDialog(null, "Salario mensal do Vendedor(a):");
        vendas = JOptionPane.showInputDialog(null, "Total do valor em vendas que " + nome + " fez:");
        comissao = JOptionPane.showInputDialog(null, "Porcentagem de comissão:");

        comissaoInt = Integer.parseInt(comissao);
        salarioInt = Integer.parseInt(salario);
        vendasInt = Integer.parseInt(vendas);

        total = (vendasInt/comissaoInt)+salarioInt;

        JOptionPane.showMessageDialog(null, "O Salario final de " + nome + " com a comissão de " + comissaoInt + "% por ter vendido R$" + vendasInt + " em Produtos, será de R$" + total );

    }
    
}
