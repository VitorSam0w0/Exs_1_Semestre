package Exs.Lista1;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Ex11_19_07 {

    public static void main (String[] args) {

        String cigarrosdia, preco;
        double total, precodouble, cigarrosdiadouble, cigarrosanodouble;

        cigarrosanodouble = 365;

        Scanner scanner = new Scanner(System.in);
        DecimalFormat format  = new DecimalFormat("0.00");

        preco = JOptionPane.showInputDialog(null, "Qual o Preço de uma carteira com 20 Cigarro: ");
        cigarrosdia = JOptionPane.showInputDialog(null, "Qual A Quantia de Cigarros Fumados por dia: ");

        precodouble = Double.parseDouble(preco);
        double cigarrosporcento = precodouble/20;
        cigarrosdiadouble = Double.parseDouble(cigarrosdia);

        total = (cigarrosporcento*cigarrosdiadouble)*cigarrosanodouble;

        JOptionPane.showMessageDialog(null, "Esse Fumante gasta em media R$" + format.format(total) + " por ano ");



    }
    
}
