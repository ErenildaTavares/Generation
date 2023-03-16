package exerciciosGeneration.ExerciciosDia16;

import java.util.Scanner;

public class exLacoW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idade;
        int totalMenores=0;
        int totalmaiores=0;

        System.out.println("Digite A idade: ");
        idade = scan.nextInt();

        while(idade > 0){

            if(idade < 21){
                totalMenores++;
            }else if (idade > 50){
                totalmaiores++;
            }

            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

        }

        System.out.println("O total de pessoas menores de 21 anos é: "+totalMenores);
        System.out.println("O total de pessoas Maiores que 50 anos é: "+totalmaiores);

        scan.close();
    }
}
