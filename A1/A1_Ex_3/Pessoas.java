package A1.A1_Ex_3;

import javax.swing.*;

import java.util.*;

public class Pessoas {

    public static void main (String[] args) {

        String Cor_Cabelo[];
        String Cor_Olhos[];
        String sexo[];

        int tamanho = 2, maioridade = 0, quantidade = 0, quantidade2 = 0;

        int idade[];

        Cor_Cabelo = new String[tamanho];
        Cor_Olhos = new String[tamanho];
        sexo = new String[tamanho];
        idade = new int [tamanho];

        for (int i = 0; i < tamanho; i++) {

            sexo[i] = JOptionPane.showInputDialog("Digite O Sexo: \n Maculino(M)  Feminino(F)");

            idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite A idade:"));

            Cor_Cabelo[i] = JOptionPane.showInputDialog("Digite A Cor Do Cabelo: \n Louros (L) \n Castanhos (C) \n Pretos (P)");

            Cor_Olhos[i] = JOptionPane.showInputDialog("Digite a Cor dos Olhos: \n Castanhos (C) \n Azuis (A) \n Verdes (V)");

        }

        for (int i= 0; i < tamanho; i++ ) {

            if ( Cor_Olhos[i].equals("V") && Cor_Cabelo[i].equals("L")) {
                quantidade2++;
            }

            if (idade[i] > maioridade) {

                maioridade = idade[i];

            }
            if (idade[i] >= 18 && idade[i] <= 35 && sexo[i].equals("F") ){
                quantidade++;
            }


        }


        
        JOptionPane.showMessageDialog(null, "A Maior Idade é: " + maioridade);

        JOptionPane.showMessageDialog(null, "A quantidade de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos é " + quantidade );

        JOptionPane.showMessageDialog(null, "A quantidade de indivíduos que tenham olhos verdes e cabelos louros é " + quantidade2);


    }
    
}
