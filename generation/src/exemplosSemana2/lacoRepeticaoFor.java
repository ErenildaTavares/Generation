package exemplosSemana2;

import java.util.Scanner;

public class lacoRepeticaoFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1, n2, n3, media, somaMedia=0, mediaGeral;
        int x;
        String nome;

        for(x = 1; x <= 3 ; x++){

            System.out.println("\nDigite o nome do Alune: ");
            nome = scan.nextLine();
            scan.nextLine(); //limpar cache
            System.out.println("\nEntre com a primeira nota: ");
            n1 = scan.nextFloat();
            System.out.println("\nEntre com a segunda nota: ");
            n2 = scan.nextFloat();
            System.out.println("\nEntre com a terceira nota: ");
            n3 = scan.nextFloat();
            media = (n1 + n2 + n3)/3;
            somaMedia += media; // somamedia = Somamedia + media
            System.out.println("A media do alune: " + nome + "foi de: " + media);
        }
        mediaGeral = somaMedia /3;
        System.out.printf("\nMedia geral da turma foi de: %.2f", mediaGeral);

    
        scan.close();
    }
   
}
