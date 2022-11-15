package Exs.Lista1;

import javax.swing.*;
import javax.swing.event.InternalFrameEvent;

public class Ex15_19_07 {

    //digitar: Nome, quantidade de horas trabalhadas, o valor pago pôr hora de trabalho
    //percentual de desconto de um funcionário.

    public static void main (String[] args) {

        String nome, salario, desconto, dia;
        int salario1, desconto1, porcentagem, total, porcentagem2, dia1;

        nome = JOptionPane.showInputDialog(null, "Digite o Nome do Funcionario(a):");
        dia = JOptionPane.showInputDialog(null, "Digite quantas horas o funcionario(a) Trabalha por dia:");
        salario = JOptionPane.showInputDialog(null, "Digite Quanto o Funcionario(a) Ganha por Hora:");
        desconto = JOptionPane.showInputDialog(null, "Digite Quantas Horas o funcionario(a) faltou no dia:");

        salario1 = Integer.parseInt(salario);
        desconto1 = Integer.parseInt(desconto);
        dia1 = Integer.parseInt(dia);

        porcentagem = (salario1*dia1);
        porcentagem2 = (desconto1*dia1);

        total = (porcentagem-porcentagem2);

        JOptionPane.showMessageDialog(null, "O Funcionario(a) " + nome + " faltou " + desconto + "h nesse dia e recebeu " + total + " ao final do dia");

    }
    
}
