package exemplosAulaVM;

import java.util.Scanner;

public class exAulaArr {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            // new = instanciar
            float[] media = new float[3];
            float n1, n2, n3, somaMedia = 0, mediaGeral;
            int x; // variavel de loop

            for (x = 0; x < 3; x++) {
                System.out.println("\nEntre com a primeira nota: ");
                n1 = scan.nextFloat();
                System.out.println("\nEntre com a segunda nota: ");
                n2 = scan.nextFloat();
                System.out.println("\nEntre com a terceira nota: ");
                n3 = scan.nextFloat();

                media[x] = (n1+n2+n3)/3;
                System.out.println("Sua media foi de: " +media[x]);
                somaMedia += media[x];

            }
            mediaGeral = somaMedia /3;
            System.out.printf("\n Media geral: %.2f" ,mediaGeral);

            for(x=0; x<3; x++){
                System.out.println("\nMedia do alune "+ (x+1)+" : "+ media[x]);
            }
            
            scan.close();
        }
    }
}
