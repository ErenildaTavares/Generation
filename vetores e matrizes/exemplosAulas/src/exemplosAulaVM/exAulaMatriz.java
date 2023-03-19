package exemplosAulaVM;

import java.util.Scanner;

public class exAulaMatriz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*1 lihna e 1 coluna. 3linhas com 3 colunas. 
        matriz sempre tem for encaeado,
        um for dentro do outro.
        */

        int[][] numeros = new int[3][3];
        int linha, coluna, somaMatriz=0, somaDiagonal=0;
        
        for(linha = 0;linha < 3;linha++){
            for(coluna = 0; coluna < 3; coluna++){
                System.out.println("\nEntre com um numero: ");
                numeros[linha][coluna] = scan.nextInt();
                somaMatriz += numeros[linha][coluna];

                if (linha == coluna){
                    somaDiagonal += numeros[linha][coluna];
                }

            }
        }
        System.out.println("\nSoma dos valores da matriz: "+somaMatriz);
        System.out.println("\nSoma dos valores da diagonal principal: "+somaDiagonal);


    }
}
