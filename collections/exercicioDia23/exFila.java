package collections.exercicioDia23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exFila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        int opcao;

        while (true) {

            System.out.println("********************************************************");
            System.out.println();
            System.out.println("\n1 - adicionar Cliente na fila ");
            System.out.println("\n2- Listar todos os clientes ");
            System.out.println("\n3- Retirar Cliente da fila ");
            System.out.println("\n0- Sair");
            System.out.println("********************************************************");
            System.out.println("Entre com a opção desejada: ");

            opcao = scan.nextInt();
            if (opcao == 0) {
                System.out.println("Obrigado por usar nosso sistema!");
                break;
            }
            switch (opcao) {

                case 1:
                    System.out.println("digite seu nome");
                    scan.nextLine();
                    String nome = scan.nextLine();
                    fila.add(nome);
                    System.out.println("cliente adicionado!");
                    break;

                case 2:
                    System.out.println("todos os clientes: " + fila);
                    break;

                case 3:
                    System.out.println("cliente chamado: " + fila.poll());
                    break;

                default:
                    System.out.println("Numero invalido!");

            }

            if (fila.isEmpty()) {
                System.out.println("Fila vazia!");
            }

        }
        scan.close();

    }

}
