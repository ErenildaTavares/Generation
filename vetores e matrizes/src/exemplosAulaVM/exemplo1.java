package exemplosAulaVM;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int[] num = new int[10] ;
			int numero,x,cont=0;
			
			;
			for(x=0;x<10;x++) {
				System.out.println("\nEntre com um número do Array: ");
				num[x] = scan.nextInt();
				
			}
			System.out.println("\nDigite um número: ");
			numero = scan.nextInt();

			for(x=0;x<10;x++) {
				
				if(num[x] == numero) {
					System.out.println("\nA posição do número digitado é: "+x);
					cont++;
				}
			}
			
			if(cont == 0) {
				System.out.println("\nNão foi encontrado");
			}
			scan.close();
		}

	}

}
//exercicio resolvido pelo professor


