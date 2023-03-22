package exemplosSemana2;

import java.util.Scanner;

public class notaENome {
    public static void main(String[] args) {
        String nome = "Lucas Vinicius";
        int idade = 26, x = 7;
        double altura = 1.86, nota1, nota2, nota3, media;

        Scanner scan = new Scanner(System.in);

        System.out.println("\n Seu nome é: " + nome);
        System.out.println("\n Sua Idade é: " + idade + "Anos de Vida");
        System.out.println("\n Sua alturea é: " + altura + " Metros");

        System.out.println("\n Entre com a primeira nota: ");
        nota1 = scan.nextDouble();
        System.out.println("\n Entre com a segunda nota: ");
        nota2 = scan.nextDouble();
        System.out.println("\n Entre com a terceira nota: ");
        nota3 = scan.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        System.out.println("\n Média aritmetica foi de: " + media); // usa + como concatenação, questao de sintaxe.

        System.out.printf("\n Média aritmetica foi de: %.2f", media); // usa , por questao de sintaxe.

        nota1 = Math.sqrt(nota2); // para raiz quadrada.

        nota2 = Math.pow(nota3, 3); // para potencia e elevar ao cubo.

        x = idade % x; // saber o resto de divisao.

        scan.close();
    }

}