package A1.A1_Ex_2;


import javax.swing.*;
import java.util.*;
import java.text.*;


public class Media {


    public static void main (String[] args) {

        String escolha1, escolha2, escolha3, escolha4, escolha5;


        String cadastro, cadastrados;

        int calc_nota;
        int[] nota_Int;

        int[] media_aluno;
        String[] media_aluno_String;

        String[] nome;
        String[] nota;
        String[] media;

        String[] Aprovado, Reprovado, Em_Recuperacao;
        String[] Status;

        Status = new String[20];
        Aprovado = new String[20];
        Reprovado = new String[20];
        Em_Recuperacao = new String[20];

        Aprovado[0] = "Aprovado(a) :)";
        Aprovado[1] = "Aprovado(a) :)";
        Aprovado[2] = "Aprovado(a) :)";
        Aprovado[3] = "Aprovado(a) :)";
        Aprovado[4] = "Aprovado(a) :)";

        Reprovado[0] = "Reprovado(a) :(";
        Reprovado[1] = "Reprovado(a) :(";
        Reprovado[2] = "Reprovado(a) :(";
        Reprovado[3] = "Reprovado(a) :(";
        Reprovado[4] = "Reprovado(a) :(";

        Em_Recuperacao[0] = "Em Recuperação :|";
        Em_Recuperacao[1] = "Em Recuperação :|";
        Em_Recuperacao[2] = "Em Recuperação :|";
        Em_Recuperacao[3] = "Em Recuperação :|";
        Em_Recuperacao[4] = "Em Recuperação :|";
        

        nome = new String[30];
        nota = new String[30];
        media = new String[30];

        int i = 1;

        while (i==1) {

            try {

                escolha1 = JOptionPane.showInputDialog(null, "Cadastrar Aluno?(1)  Ja Tem Cadastro?(2)");

                if (escolha1.equals("1")) {
    
                    String sair;
                    Boolean sairBOO1 = true;
    
                    while(sairBOO1==true) {
    
                        JOptionPane.showMessageDialog(null, "Cadastro de Aluno(a)");
    
                        nome[0] = JOptionPane.showInputDialog(null, "Digite o Nome Do Aluno(a)");
        
                        nota[0] = JOptionPane.showInputDialog(null, "Digite A Nota 1 Do Aluno(a) " + nome[0]);
                        nota[1] = JOptionPane.showInputDialog(null, "Digite A Nota 2 Do Aluno(a) " + nome[0]);
                        nota[2] = JOptionPane.showInputDialog(null, "Digite A Nota 3 Do Aluno(a) " + nome[0]);
    
                        sairBOO1 = false;

    

    
    
                    }

                    nota_Int = new int[10];
    
                    nota_Int[0] = Integer.parseInt(nota[0]);
                    nota_Int[1] = Integer.parseInt(nota[1]);
                    nota_Int[2] = Integer.parseInt(nota[2]);

                    calc_nota = (nota_Int[0]+nota_Int[1]+nota_Int[2])/3;

                    media_aluno = new int[10];

                    media_aluno[0] = calc_nota;

                    media_aluno_String = new String[20];

                    media_aluno_String[0] = Integer.toString(media_aluno[0]);
                    

                    if (media_aluno[0]>=7) {


                        Status[0] = Aprovado[0];
                    
                    } else if (media_aluno[0]<=2) {

                        Status[0] = Reprovado[0];

                    } else {

                        Status[0] = Em_Recuperacao[0];

                    }

                JOptionPane.showMessageDialog(null, "A Media do Aluno(a) é " + media_aluno[0]);


    
                    escolha2 = JOptionPane.showInputDialog(null, "Cadastrar Aluno?(1)  Ja Tem Cadastro?(2)");
    
                    if (escolha2.equals("1")) {
    
                        Boolean sairBOO2 = true;
            
                                while(sairBOO2==true) {
            
                                    nome[1] = JOptionPane.showInputDialog(null, "Digite o Nome Do Aluno(a)");
            
                                    nota[3] = JOptionPane.showInputDialog(null, "Digite A Nota 1 Do Aluno(a) " + nome[1]);
                                    nota[4] = JOptionPane.showInputDialog(null, "Digite A Nota 2 Do Aluno(a) " + nome[1]);
                                    nota[5] = JOptionPane.showInputDialog(null, "Digite A Nota 3 Do Aluno(a) " + nome[1]);
            
                                    sairBOO2 = false;
    
    
    
                                }

                                nota_Int = new int[10];
    
                                nota_Int[3] = Integer.parseInt(nota[3]);
                                nota_Int[4] = Integer.parseInt(nota[4]);
                                nota_Int[5] = Integer.parseInt(nota[5]);
    
                                calc_nota = (nota_Int[3]+nota_Int[4]+nota_Int[5])/3;
    
                                media_aluno = new int[10];
    
                                media_aluno[1] = calc_nota;

                                media_aluno_String[1] = Integer.toString(media_aluno[1]);

                                if (media_aluno[1]>=7) {


                                    Status[1] = Aprovado[1];
                                
                                } else if (media_aluno[1]<=2) {
            
                                    Status[1] = Reprovado[1];
            
                                } else {
            
                                    Status[1] = Em_Recuperacao[1];
            
                                }
    
                                JOptionPane.showMessageDialog(null, "A Media do Aluno(a) é " + media_aluno[1]);
            
    
                        } else if (escolha2.equals("2")) {
    
                            
                    
                            JOptionPane.showMessageDialog(null, "Aluno: " + nome[0] + "\n nota 1: " + nota[0] + "\n nota 2: " + nota[1] + "\n nota 3: " + nota[2] + "\n Media: " + media_aluno_String[0] + "\n Status: " + Status[0] +
                            "\n \nAluno: " + nome[1] + "\n nota 1: " + nota[3] + "\n nota 2: " + nota[4] + "\n nota 3: " + nota[5] + "\n Media: " + media_aluno_String[1] + "\n Status: " + Status[1] +
                            "\n \nAluno: " + nome[2] + "\n nota 1: " + nota[6] + "\n nota 2: " + nota[7] + "\n nota 3: " + nota[8] + "\n Media: " + media_aluno_String[2] + "\n Status: " + Status[2] +
                            "\n \nAluno: " + nome[3] + "\n nota 1: " + nota[9] + "\n nota 2: " + nota[10] + "\n nota 3: " + nota[11] + "\n Media: " + media_aluno_String[3] + "\n Status: " + Status[3] +
                            "\n \nAluno: " + nome[4] + "\n nota 1: " + nota[12] + "\n nota 2: " + nota[13] + "\n nota 3: " + nota[14] + "\n Media: "  + media_aluno_String[4] + "\n Status: " + Status[4] 
                            );
                        }
    
    
                        escolha3 = JOptionPane.showInputDialog(null, "Cadastrar Aluno?(1)  Ja Tem Cadastro?(2)");
    
                        if (escolha3.equals("1")) {
    
                            Boolean sairBOO3 = true;
                
                                    while(sairBOO3==true) {
                
                
                                        nome[2] = JOptionPane.showInputDialog(null, "Digite o Nome Do Aluno(a)");
                
                                        nota[6] = JOptionPane.showInputDialog(null, "Digite A Nota 1 Do Aluno(a) " + nome[2]);
                                        nota[7] = JOptionPane.showInputDialog(null, "Digite A Nota 2 Do Aluno(a) " + nome[2]);
                                        nota[8] = JOptionPane.showInputDialog(null, "Digite A Nota 3 Do Aluno(a) " + nome[2]);
                
                                        sairBOO3 = false;
    
    
                                    }

                                    nota_Int = new int[10];
    
                                    nota_Int[6] = Integer.parseInt(nota[6]);
                                    nota_Int[7] = Integer.parseInt(nota[7]);
                                    nota_Int[8] = Integer.parseInt(nota[8]);
                
                                    calc_nota = (nota_Int[6]+nota_Int[7]+nota_Int[8])/3;
                
                                    media_aluno = new int[10];
                
                                    media_aluno[2] = calc_nota;

                                    media_aluno_String[2] = Integer.toString(media_aluno[2]);

                                    if (media_aluno[2]>=7) {


                                        Status[2] = Aprovado[2];
                                    
                                    } else if (media_aluno[2]<=2) {
                
                                        Status[2] = Reprovado[2];
                
                                    } else {
                
                                        Status[2] = Em_Recuperacao[2];
                
                                    }

                                    JOptionPane.showMessageDialog(null, "A Media do Aluno(a) é " + media_aluno[2]);

                        }  else if (escolha3.equals("2")) {
                    
                            JOptionPane.showMessageDialog(null, "Aluno: " + nome[0] + "\n nota 1: " + nota[0] + "\n nota 2: " + nota[1] + "\n nota 3: " + nota[2] + "\n Media: " + media_aluno_String[0] + "\n Status: " + Status[0] +
                            "\n \nAluno: " + nome[1] + "\n nota 1: " + nota[3] + "\n nota 2: " + nota[4] + "\n nota 3: " + nota[5] + "\n Media: + " + media_aluno_String[1] + "\n Status: " + Status[1] +
                            "\n \nAluno: " + nome[2] + "\n nota 1: " + nota[6] + "\n nota 2: " + nota[7] + "\n nota 3: " + nota[8] + "\n Media: " + media_aluno_String[2] + "\n Status: " + Status[2] +
                            "\n \nAluno: " + nome[3] + "\n nota 1: " + nota[9] + "\n nota 2: " + nota[10] + "\n nota 3: " + nota[11] + "\n Media: " + media_aluno_String[3] + "\n Status: " + Status[3] +
                            "\n \nAluno: " + nome[4] + "\n nota 1: " + nota[12] + "\n nota 2: " + nota[13] + "\n nota 3: " + nota[14] + "\n Media: "  + media_aluno_String[4] + "\n Status: " + Status[4]
                                );
                        }
    
                            escolha4 = JOptionPane.showInputDialog(null, "Cadastrar Aluno?(1)  Ja Tem Cadastro?(2)");
    
                        if (escolha4.equals("1")) {
    
                            Boolean sairBOO4 = true;
                    
                            while(sairBOO4==true) {
        
        
                                nome[3] = JOptionPane.showInputDialog(null, "Digite o Nome Do Aluno(a)");
        
                                nota[9] = JOptionPane.showInputDialog(null, "Digite A Nota 1 Do Aluno(a) " + nome[3]);
                                nota[10] = JOptionPane.showInputDialog(null, "Digite A Nota 2 Do Aluno(a) " + nome[3]);
                                nota[11] = JOptionPane.showInputDialog(null, "Digite A Nota 3 Do Aluno(a) " + nome[3]);
        
                                sairBOO4 = false;
    
                                nota_Int = new int[10];
    
    
                            }

                            nota_Int[9] = Integer.parseInt(nota[9]);
                            nota_Int[10] = Integer.parseInt(nota[10]);
                            nota_Int[11] = Integer.parseInt(nota[11]);
        
                            calc_nota = (nota_Int[9]+nota_Int[10]+nota_Int[11])/3;
        
                            media_aluno = new int[10];
        
                            media_aluno[3] = calc_nota;

                            media_aluno_String[3] = Integer.toString(media_aluno[3]);

                            if (media_aluno[3]>=7) {


                                Status[3] = Aprovado[3];
                            
                            } else if (media_aluno[3]<=2) {
        
                                Status[3] = Reprovado[3];
        
                            } else {
        
                                Status[3] = Em_Recuperacao[3];
        
                            }

                            JOptionPane.showMessageDialog(null, "A Media do Aluno(a) é " + media_aluno[3]);

                        }  else if (escolha4.equals("2")) {
                    
                            JOptionPane.showMessageDialog(null, "Aluno: " + nome[0] + "\n nota 1: " + nota[0] + "\n nota 2: " + nota[1] + "\n nota 3: " + nota[2] + "\n Media: " + media_aluno_String[0] + "\n Status: " + Status[0] +
                            "\n \nAluno: " + nome[1] + "\n nota 1: " + nota[3] + "\n nota 2: " + nota[4] + "\n nota 3: " + nota[5] + "\n Media: + " + media_aluno_String[1] + "\n Status: " + Status[1] +
                            "\n \nAluno: " + nome[2] + "\n nota 1: " + nota[6] + "\n nota 2: " + nota[7] + "\n nota 3: " + nota[8] + "\n Media: " + media_aluno_String[2] + "\n Status: " + Status[2] +
                            "\n \nAluno: " + nome[3] + "\n nota 1: " + nota[9] + "\n nota 2: " + nota[10] + "\n nota 3: " + nota[11] + "\n Media: " + media_aluno_String[3] + "\n Status: " + Status[3] +
                            "\n \nAluno: " + nome[4] + "\n nota 1: " + nota[12] + "\n nota 2: " + nota[13] + "\n nota 3: " + nota[14] + "\n Media: "  + media_aluno_String[4] + "\n Status: " + Status[4]
                                );
                        }
    
                            escolha5 = JOptionPane.showInputDialog(null, "Cadastrar Aluno?(1)  Ja Tem Cadastro?(2)");
    
                            if (escolha5.equals("1")) {
        
    
                                Boolean sairBOO5 = true;
                            
                                while(sairBOO5==true) {
            
            
                                    nome[4] = JOptionPane.showInputDialog(null, "Digite o Nome Do Aluno(a)");
            
                                    nota[12] = JOptionPane.showInputDialog(null, "Digite A Nota 1 Do Aluno(a) " + nome[4]);
                                    nota[13] = JOptionPane.showInputDialog(null, "Digite A Nota 2 Do Aluno(a) " + nome[4]);
                                    nota[14] = JOptionPane.showInputDialog(null, "Digite A Nota 3 Do Aluno(a) " + nome[4]);
            
                                    sairBOO5 = false;
    
    
                                } 

                                nota_Int = new int[10];
    
                                nota_Int[12] = Integer.parseInt(nota[12]);
                                nota_Int[13] = Integer.parseInt(nota[13]);
                                nota_Int[14] = Integer.parseInt(nota[14]);
            
                                calc_nota = (nota_Int[12]+nota_Int[13]+nota_Int[14])/3;
            
                                media_aluno = new int[10];
            
                                media_aluno[4] = calc_nota;

                                media_aluno_String[4] = Integer.toString(media_aluno[4]);

                                if (media_aluno[4]>=7) {


                                    Status[4] = Aprovado[4];
                                
                                } else if (media_aluno[4]<=2) {
            
                                    Status[4] = Reprovado[4];
            
                                } else {
            
                                    Status[4] = Em_Recuperacao[4];
            
                                }

                                JOptionPane.showMessageDialog(null, "A Media do Aluno(a) é " + media_aluno[4]);
    
                            }  else if (escolha5.equals("2")) {

                    
                                JOptionPane.showMessageDialog(null, "Aluno: " + nome[0] + "\n nota 1: " + nota[0] + "\n nota 2: " + nota[1] + "\n nota 3: " + nota[2] + "\n Media: " + media_aluno_String[0] + "\n Status: " + Status[0] +
                                "\n \nAluno: " + nome[1] + "\n nota 1: " + nota[3] + "\n nota 2: " + nota[4] + "\n nota 3: " + nota[5] + "\n Media: + " + media_aluno_String[1] + "\n Status: " + Status[1] +
                                "\n \nAluno: " + nome[2] + "\n nota 1: " + nota[6] + "\n nota 2: " + nota[7] + "\n nota 3: " + nota[8] + "\n Media: " + media_aluno_String[2] + "\n Status: " + Status[2] +
                                "\n \nAluno: " + nome[3] + "\n nota 1: " + nota[9] + "\n nota 2: " + nota[10] + "\n nota 3: " + nota[11] + "\n Media: " + media_aluno_String[3] + "\n Status: " + Status[3] +
                                "\n \nAluno: " + nome[4] + "\n nota 1: " + nota[12] + "\n nota 2: " + nota[13] + "\n nota 3: " + nota[14] + "\n Media: "  + media_aluno_String[4] + "\n Status: " + Status[4]
                                );
                            }
    
        
    
                } else if (escolha1.equals("2")) {

                    JOptionPane.showMessageDialog(null, "Você deve Selecionar Pelo Menos Um Aluno!");

                    
    
                }
    
            } catch ( Exception erro ) {

                JOptionPane.showMessageDialog(null, "Seu programa deu o Seguinte ERRO: " + erro);

            } finally {
                JOptionPane.showMessageDialog(null, "Algo de Errado :(\n Fechando Programa... ");
                break;
            }

            }


    }
    
}
