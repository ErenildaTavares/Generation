package collections.exerciciosDia21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex1List {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);

        cores.add(" ");
        
        for(String listaCores:cores){
        System.out.println("\nescreva 1 cor: ");
        listaCores=scan.nextLine();
        cores.add(0, listaCores);
        System.out.println("\nescreva 1 cor: ");
        listaCores=scan.nextLine();
        cores.add(1, listaCores);
        System.out.println("\nescreva 1 cor: ");
        listaCores=scan.nextLine();
        cores.add(2, listaCores);
        System.out.println("\nescreva1 cor: ");
        listaCores=scan.nextLine();
        cores.add(3, listaCores);
        System.out.println("\nescreva 1 cor: ");
        listaCores=scan.nextLine();
        cores.add(4, listaCores);
        cores.contains(listaCores);

            System.out.println("\nAs  cores: ");
            System.out.println(cores);
            

            for(int i = 0; i < cores.size();i++){    
            }
            Collections.sort(cores);

            System.out.println("\nCores por ordem alfabetica: ");
            System.out.println(cores);
        }
        
scan.close();

    }
    
}
