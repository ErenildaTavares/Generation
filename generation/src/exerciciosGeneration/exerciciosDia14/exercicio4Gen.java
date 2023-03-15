package exerciciosGeneration.exerciciosDia14;
import java.util.Scanner;

public class exercicio4Gen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1, n2, n3, n4, diferenca;

        System.out.println("digite o valor do numero 1: ");
        n1 = scan.nextFloat();
        System.out.println("digite o valor do numero 2: ");
        n2 = scan.nextFloat();
        System.out.println("digite o valor do numero 3: ");
        n3 = scan.nextFloat();
        System.out.println("digite o valor do numero 4: ");
        n4 = scan.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.printf("A diferença é:%.2f ", diferenca);

        scan.close();
    }
}