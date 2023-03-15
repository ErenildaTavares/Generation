import java.util.Scanner;

public class exercicio2Gen {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota1 = 10.0f;
        float nota2 = 8.0f;
        float nota3 = 7.0f;
        float nota4 = 7.5f;
        float media;

        System.out.println("\n Entre com a primeira nota: ");
        nota1 = scan.nextFloat();
        System.out.println("\n Entre com a segunda nota: ");
        nota2 = scan.nextFloat();
        System.out.println("\n Entre com a terceira nota: ");
        nota3 = scan.nextFloat();
        System.out.println("\n Entre com a quarta nota: ");
        nota4 = scan.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Sua Média foi de: %.2f ", media);

        scan.close();

    }
}
