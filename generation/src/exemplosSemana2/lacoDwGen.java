package exemplosSemana2;

import java.util.Scanner;

public class lacoDwGen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada, x=1, resultado;

        System.out.println("Digite a tabuada que deseja visualizar: ");
        tabuada = scan.nextInt();

        do{

            resultado =  tabuada * x;
            System.out.println("\n"+ tabuada + " X " + x + " = " + resultado);
            x++;

        }while(x<=10);

        scan.close();
    }
}
