package collections.exemplosAula;

import java.util.Iterator;
import java.util.Stack;

public class exPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();

        pilha.push("Prato Verde");
        pilha.push("Prato Vermelho");
        pilha.push("Prato Preto");
        pilha.push("Prato Preto");
        pilha.push("Prato Preto");

        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nRetirar um elemento da pilha: "+pilha.pop());
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nElemento no topo da pilha: "+pilha.peek()); 
        System.out.println("\nAdicionando um elemento chamado prato roxo: "+pilha.push("Prato Roxo"));
        System.out.println("\nElementos da pilha: "+pilha);
        System.out.println("\nTamando da pilha: "+pilha.size());
        System.out.println("\nVerificar um elemento da pilha: "+pilha.contains(" Prato Azul "));
        System.out.println("\nExibir todos os elementos da minha pilha...");
        System.out.println();

        Iterator<String> iterator = pilha.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
