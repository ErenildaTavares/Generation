package collections.exercicioDia23;

import java.util.Scanner;
import java.util.Stack;

public class exercicioPilha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack<String> livros = new Stack<String>();

        while (true) {

            System.out.println("********************************************************");
            System.out.println();
            System.out.println("\n1 - adicionar livro na pilha ");
            System.out.println("\n2- Listar todos os livros ");
            System.out.println("\n3- Retirar livro da pilha ");
            System.out.println("\n0- Sair");
            System.out.println("********************************************************");
            System.out.println("Entre com a opção desejada: ");

            int op = scan.nextInt();
            if (op == 0) {
                System.out.println("Obrigado por usar nosso sistema!");
                break;
            }
            
            switch (op) {

                case 1:
                    System.out.println("digite o livro que deseja adicionar: ");
                    scan.nextLine();
                    String nomeLivro = scan.nextLine();
                    livros.push(nomeLivro);
                    System.out.println("Livro adicionado!");
                    break;
                case 2:
                    System.out.println("Lista de todos os livros: " + livros);
                    break;

                case 3:
                    System.out.println("Um livro foi retirado da pilha! " + livros.pop());
                    break;

                    default:
                    System.out.println("Numero invalido!");
                    break;
            }

            if(livros.isEmpty()) {
                System.out.println("Pilha vazia!");
            }
        }
        scan.close();
    }

}
