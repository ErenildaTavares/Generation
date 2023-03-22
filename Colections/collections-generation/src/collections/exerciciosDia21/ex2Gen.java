package collections.exerciciosDia21;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class ex2Gen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> numerosSet= new HashSet<Integer>();

        numerosSet.add(1);
        numerosSet.add(2);
        numerosSet.add(3);
        numerosSet.add(4);
        numerosSet.add(5);
        numerosSet.add(6);
        numerosSet.add(7);
        numerosSet.add(8);
        numerosSet.add(9);
        numerosSet.add(10);


        
        
        for(int i =0; i>numerosSet.size(); i++){
            System.out.println("Digite os numeros: ");
        int listaNum = scan.nextInt();
            numerosSet.add(listaNum);
        
        }
        System.out.println("posicao do set: ");
        System.out.println(numerosSet);
        
        Iterator<Integer> inumerosSet = numerosSet.iterator();

        while(inumerosSet.hasNext()){
            System.out.println(inumerosSet.next());
        }

        
        
    }
    
}
