package collections.exemplosAula;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exQueueGen {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();

        for(int i=0; i<=10; i++){
            fila.add(i);
        }
        System.out.println("\nElementos da fila: "+fila);
        System.out.println("\n Removendo um elemento da fila "+ fila.remove());
        System.out.println("\nElementos da fila apos a remoção: "+ fila);
        System.out.println("\nAdicionando um elemento na fila: "+fila.add(11));
        System.out.println("\nElementos da fila: "+fila);
        System.out.println("\nPegabdo o primeiro elemento da fila: " + fila.peek());
        System.out.println("\nPengando o tamanho da fila: "+fila.size());
        System.out.println("\nVerificando um elemento na fila: "+fila.contains(37));
        System.out.println("\nExibindo e retirando  primeir elemento da fila:"+fila.poll());
        System.out.println("\nElementos da fila: "+fila);

        Iterator<Integer> iterator = fila.iterator(); //é uma API organiza e ordena a fila

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nLimpando a fila: ");
        fila.clear();
        System.out.println("Verificando se a fila esta limpa: " + fila.isEmpty());
        System.out.println("\nElementos da fila: "+fila);
    }
}
