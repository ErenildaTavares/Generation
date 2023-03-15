package exerciciosGeneration.exercicioDia15;

import java.util.Scanner;

public class exec1Gen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b, c;

        System.out.println("\nDigite o valor a: ");
        a = scan.nextInt();
        System.out.println("\nDigite o valor de b: ");
        b = scan.nextInt();
        System.out.println("\nDigite o valor de c: ");
        c = scan.nextInt();

        if (a + b > c) {
            System.out.println("A soma de A + B é maior que C");

        } else if (a + b < c) {
            System.out.println("A soma de A + B é Menor que C ");

        } else if (a + b == c) {
            System.out.println("A soma de A + B é igual a C ");

        }

        scan.close();

    }
}
