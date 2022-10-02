package Exs.Lista1;

import java.util.Scanner;

public class Ex5_19_07 {

    public static void main (String[] args) {

        int dia, hora, minuto, segundo, segundo1, segundo2, segundo3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora ");
        hora = scanner.nextInt();

        System.out.println("Minuto ");
        minuto = scanner.nextInt();

        System.out.println("Segundo ");
        segundo = scanner.nextInt();

        segundo1 = ((hora*3600));
        segundo2 = ((minuto*60));
        segundo3 = ((segundo+segundo1+segundo2)); 
        System.out.println("A Quantidade de Segundos que " + hora + " horas, " + minuto + " minutos e " + segundo + " Segundos é igual a " + segundo3 + " Segundos 10");

        



    }
    
}
