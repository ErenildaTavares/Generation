package exerciciosGeneration.ExerciciosDia16;

import java.util.Scanner;

public class exercicio2LacoF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = 0;
        int numeroPar = 0;
        int contImpar = 0;

        for(int i = 1; i <= 10 ;i++){
            System.out.println("Digite o " + i +  "º numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0 ) numeroPar ++;
            else contImpar ++;
        }
        
        System.out.println("Numeros pares: " + numeroPar);
        System.out.println("Numeros impares: " + contImpar);

        scan.close();

       
    }
}
