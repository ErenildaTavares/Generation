package exerciciosGeneration.exerciciosDia14;
import java.util.Scanner;

public class exercicio1Gen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float salario = 10000.00f;
        float novoSalario = 11000.00f;
        float abono = 1000.00f;

        System.out.println("\n Digite o salário: ");
        salario = scan.nextFloat();
        System.out.println("\n Digite o Abono: ");
        abono = scan.nextFloat();

        novoSalario = salario + abono;

        System.out.println("\n Novo salário é: "+ novoSalario);

        scan.close();
    }
}