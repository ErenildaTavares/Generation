package exerciciosGeneration.exercicioDia15;

import java.util.Scanner;

public class exercicioTabela {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidade = 0;
        int numero;

        System.out.println("\t\t produto: ");

        System.out.println("\n1 Cachorro quente ");

        System.out.println("\n2 X-salada ");

        System.out.println("\n3 X-Bacon ");

        System.out.println("\n4 Bauru ");

        System.out.println("\n5 Refrigerante  " );

        System.out.println("\n6 Suco de Laranja ");

        System.out.println("Digite o codigo do produto de 1 a 6: ");
        numero = scan.nextInt();

        System.out.println("Quantos produtos voce pegou? ");
        quantidade = scan.nextInt();

        switch (numero) {

            case 1:
                System.out.println(quantidade + " Cachorro Quente\n" + "Valor: " + quantidade * 10);
                break;
            case 2:
                System.out.println(quantidade + " X Salada\n" + "Valor: " + quantidade * 15);
                break;
            case 3:
                System.out.println(quantidade + " X bacon\n" + "Valor: " + quantidade * 18);
                break;
            case 4:
                System.out.println(quantidade + " Bauru\n" + "Valor: " + quantidade * 12);
                break;
            case 5:
                System.out.println(quantidade + " Refrigerante\n" + "Valor: " + quantidade * 8);
                break;
            case 6:
                System.out.println(quantidade + " Suco de laranja\n" + "Valor: " + quantidade * 13);
                break;
            default:
                System.out.println("\n opção invalida!");

        }
        scan.close();

    }
}
