package collections.exemplosAula;

import java.util.ArrayList;
import java.util.Scanner;

public class estoque {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int op;

        ArrayList<String> estoque = new ArrayList<>();

        do

            System.out.println("\n---------------------------------------------------");
            System.out.println("\n\t\t Menu do Estoque");
            System.out.println("\n(1) Deseja adicionar ao estoque? ");
            System.out.println("\n(2) Deseja remover produtos do estoque? ");
            System.out.println("\n(3) Deseja Atualizar produtos do estoque? ");
            System.out.println("\n(4) Deseja mostrar os produtos do estoque? ");
            System.out.println("\n(0) Deseja encerrar o programa de estoque? ");
            System.out.println("\nDigite a sua opção: ");
            op = scan.nextInt();

            switch(op){
            case 1:
                scan.nextLine();
                System.out.println("\nDigite o produto para adicionar ao estoque: ");
                String produto = scan.nextLine();
                estoque.add(produto); //adicionando produto no estoque
                break;

            case 2:
                scan.nextLine();
                System.out.println("\nDigite o produto para remover do estoque: ");
                String produtor = scan.nextLine();
                if(estoque.contains(produtor)){
                    estoque.remove(produtor);
                }else{
                    System.out.println("\n Este produto não existe! ");
                }

                System.out.println("\nProdutos no estoque: ");
                System.out.println(estoque);
                break;

            case 3:
            scan.nextLine();
            System.out.println("Digite o nome produto que deseja atualizar: ");
            String verifica = scan.nextLine();
            System.out.println("Digite o nome produto que irá entrar no lugar: ");
            String novo = scan.nextLine();
            if(estoque.contains(verifica)){
                estoque.remove(verifica);
                estoque.add(novo);
            }else{
                System.out.println("\n Este produto não existe! ");
            }

            System.out.println("\nProdutos no estoque: ");
                System.out.println(estoque);
                break;

                case 4:
                scan.nextLine();
                System.out.println("\nProdutos no estoque: ");
                System.out.println(estoque);
                break;

                case 0:
                System.out.println("Obrigado por ultilizar do nosso sistema. volte sempre!");

                default:
                System.out.println("Opção invalida! Digite novamente: ");
            }

        }while(op!=0);

        scan.close();


    }
}
