package exerciciosDia17;

import java.util.Scanner;

public class exercicioMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] numeros = new int[3][3];
        int linha, coluna, soma = 0;

        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {
                System.out.println("\nDigite um valor: ");
                numeros[linha][coluna] = scan.nextInt();
            }
        }
        System.out.println("\nDiagonal principal: ");
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 0; coluna < 3; coluna++) {

                if (linha == coluna) {
                    System.out.print(numeros[linha][coluna] + " ");
                }
                if (linha == coluna) {
                    soma += numeros[linha][coluna];
                }
            }
        }

        System.out.println("\nDiagonal secundaria: ");
        for (linha = 0; linha < 3; linha++) {
            for (coluna = 3 - 1; coluna >= 0; coluna--) {
                System.out.print(numeros[linha][coluna] + " ");
                linha++;
            }
        }
        System.out.println("\nsoma da Diagonal principal é: " + soma);
        System.out.println("\nsoma da Diagonal secundaria é: " + soma);
    }
}
