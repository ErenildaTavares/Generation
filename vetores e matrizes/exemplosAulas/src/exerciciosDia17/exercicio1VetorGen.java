package exerciciosDia17;

import java.util.Scanner;

public class exercicio1VetorGen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
        int x, numeroDigitado;

        System.out.println("Digite um numero inteiro: ");
        numeroDigitado = scan.nextInt();

        for (x = 0; x < 10; x++) {
            if (numeroDigitado == vetor[x]) {
                System.out.println("O numero está localizado na posição: " + x);
            }
        }
        if (numeroDigitado > 10) {
            System.out.println("O numero não foi encontrado!");
        }
        scan.close();
    }
}
