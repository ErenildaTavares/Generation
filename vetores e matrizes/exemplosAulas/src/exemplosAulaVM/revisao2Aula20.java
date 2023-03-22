package exemplosAulaVM;

import java.util.Scanner;

public class revisao2Aula20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] dado = new int [10];
        int somalancamento=0, quantMaior=0,x, maior=0, quantmaior=0;
        float mediaLancamento;

        for(x=0; x<10; x++){
            System.out.println("\nDigite o valor do lancamento: ");
            dado[x] = scan.nextInt();
            while(dado[x]<1 || dado[x]>6){
                System.out.println("\nDigite o valor do lancamento novamente: ");
                dado[x] = scan.nextInt(); 
            }

            somalancamento+=dado[x];//soma todos os numeros digitados.

            if(dado[x]==6 ){
                quantMaior++;
            }
            if(maior<dado[x]){
                maior=dado[x];
            }
                }
                for(x=0; x<10; x++){
                    if(dado[x] ==maior){
                        quantmaior++;
            }
        }
        mediaLancamento = somalancamento/10;
        System.out.println("\nQuantidade de vezes que saiu o maior valor: "+quantMaior);
        System.out.println("Media dos lancamentos: "+mediaLancamento);
        System.out.println("O maior lancamento foi: "+maior+" e apareceu :"+quantmaior);

    }
}
