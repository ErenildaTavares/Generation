package exemplosAulaVM;

import java.util.Scanner;

public class revisaoAula20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vet = new int[5];
        int maiorPontuacao=0, x;

        System.out.println("\nEntre com um valor: ");
            vet[0] = scan.nextInt();
            maiorPontuacao=vet[0];

        for(x=1;x<5;x++){
            System.out.println("\nEntre com um valor: ");
            vet[x] = scan.nextInt();

            if(maiorPontuacao<vet[x]){
                maiorPontuacao=vet[x];
            }
        }
        System.out.println("\nMaior pontuação foi de: "+maiorPontuacao);


    }
}
