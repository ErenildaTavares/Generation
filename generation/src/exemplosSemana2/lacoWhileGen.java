package exemplosSemana2;

import java.util.Scanner;

public class lacoWhileGen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, somaPar =0, contImpar=0;

        System.out.println("Entre com um numero ");
        numero = scan.nextInt();

        while(numero != 0){

            if(numero % 2 ==0){
                somaPar += numero; //somaPar = somaPar + numero
            }else{
                contImpar++;
            }
            System.out.println("Entre com um numero, ou digite 0 para sair do programa:");
            numero = scan.nextInt();
        }
        System.out.println("somatorio dos numeros pares foi de: " + somaPar);
        System.out.println("Quantidade ed numeros impares foi de: " + contImpar);

        scan.close();
    }

}
