package collections.exerciciosDia21;

import java.util.ArrayList;
import java.util.Scanner;

public class exer2List {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);

        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o numero que deseja verificar: ");
        int verifica = scan.nextInt();

        if(numeros.contains(verifica)){
            System.out.println("o numero "+verifica+ "esta na posicao: "+ numeros.indexOf(verifica));

       }else{
        System.out.println("o numero: "+ verifica + " nao foi encontrado! ");
       }
       scan.close();
    }
}
