package exerciciosGeneration.ExerciciosDia16;

import java.util.Scanner;

public class exLacoDw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int somaPositivo = 0;
       
        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            if(numero > 0)
            somaPositivo += numero; 

        }while( numero != 0 );

        System.out.println("A soma de numeros positivos é: " + somaPositivo);

        scan.close();

    }
}
