package collections.exerciciosDia21;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicioCollections {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> encontrarSet = new HashSet<Integer>();

        encontrarSet.add(2);
        encontrarSet.add(5);
        encontrarSet.add(1);
        encontrarSet.add(3);
        encontrarSet.add(4);
        encontrarSet.add(9);
        encontrarSet.add(7);
        encontrarSet.add(8);
        encontrarSet.add(10);
        encontrarSet.add(6);

            System.out.println("\nDigite o numero que deseja encontrar: ");
            int verificaNum = scan.nextInt();
            if (encontrarSet.contains(verificaNum)) {
                System.out.print("O numero " + verificaNum + " foi encontrado!");

            } else {
                System.out.println("Numero " + verificaNum + " Nao foi encontrado!");
            }
            
        scan.close();
    }
}
