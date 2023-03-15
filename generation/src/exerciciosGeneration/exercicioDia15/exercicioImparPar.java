package exerciciosGeneration.exercicioDia15;

import java.util.Scanner;

public class exercicioImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("\ndigite um numero: ");
        numero = scan.nextInt();

        if (numero % 2 == 0 && numero > 0 ){
            System.out.println("\nNumero é par e positivo!");
        } else if (numero % 2 == 0 && numero < 0 ){
            System.out.println("\nNumero é par e negativo !");
        }else if (numero % 2 != 0 && numero > 0) {
            System.out.println("\nNumero é impar e positivo!");

        }  else {
            System.out.println("\nNumero é impar e negativo!");
        }
            
        scan.close();
        
    }
}
