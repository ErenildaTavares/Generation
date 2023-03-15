import java.util.Scanner;

public class exercicio3Gen {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salarioBruto = 2000.00f;
        float adicionalNoturno = 500.00f;
        float horasExtras = 100.00f;
        float descontos = 200.00f;
        float salarioLiquido;

        System.out.println("\n Digite seu salario bruto: ");
        salarioBruto= scan.nextFloat();
        System.out.println("\n Digite o Adicional Noturno: ");
        adicionalNoturno = scan.nextFloat();
        System.out.println("\n Digite suas Horas Extras: ");
        horasExtras = scan.nextFloat();
        System.out.println("\n Digite o total de descontos: ");
       descontos = scan.nextFloat();

       salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;

       System.out.printf("\n Seu salario Liquido é:%.2f " , salarioLiquido);

       scan.close();
    }
}
