package Exs.Lista1;

import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Ex14_19_07 {

    public static void main (String[] args) {

        DecimalFormat format = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        String nome, salario, desconto;
        double  total, total2, salariodouble, descontodouble;

        nome = JOptionPane.showInputDialog(null, "Nome: ");
        salario = JOptionPane.showInputDialog(null, "Salario: ");
        desconto = JOptionPane.showInputDialog(null, "Percentual de Aumento Que o Funcionario ira receber:");

        try {

            salariodouble = Double.parseDouble(salario);
            descontodouble = Double.parseDouble(desconto);
    
            total = ((descontodouble/100)*salariodouble);
            total2 = (salariodouble+total);
    
            JOptionPane.showMessageDialog(null, "Funcionario(a): " + nome + " // Salario Bruto: " + format.format(salariodouble) + " // Salario Liquido a Receber Apos o Aumento: " + format.format(total2));

            
        } catch (Exception erro) {

            JOptionPane.showMessageDialog(null, "ERRO!! você deve Informar valores Validos!!"+erro);

        }

  
    }


    
}
