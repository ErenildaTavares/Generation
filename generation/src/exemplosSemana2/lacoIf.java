package exemplosSemana2;

import java.util.Scanner;

public class lacoIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1, n2, n3, media;
        int op;

        System.out.println("\n Entre com a primeira nota: ");
        n1 = scan.nextFloat();
        System.out.println("\n Entre com a primeira nota: ");
        n2 = scan.nextFloat();
        System.out.println("\n Entre com a primeira nota: ");
        n3 = scan.nextFloat();

        media = (n1 + n2 + n3)/3;
        System.out.printf("\nMedia aritmetica foi de: %.2f :" , media);

        if(media >= 7 && media <= 10){
            System.out.println("\nAlune aprovade!");

        }else if (media >= 5 && media < 7){
            System.out.println("\nAlune de exame!");

        } else {
            System.out.println("Alune Aprovade!");

        }
            
        System.out.println("\n \t\tMenu de elogios");
        System.out.println("\n1- Feliz");
        System.out.println("\n2- Acolhedora");
        System.out.println("\n3 está de parabéns");
        System.out.println("\n4 Nota 10");
        System.out.println("\n5 É show");
        System.out.println("\nDigite a sua opção: ");
         op = scan.nextInt();

         switch(op){

            case 1:
            System.out.println("\nFamilia Feliz");
            break;
            case 2:
            System.out.println("\nFamilia Acolhedora");
            break;
            case 3:
            System.out.println("\nFamilia está de parabéns");
            break;
            case 4:
            System.out.println("\nFamilia Nota 10");
            break;
            case 5:
            System.out.println("\nFamilia é show");
            break;
            default:
            System.out.println("\n opção invalida!");
           
            
            scan.close();
         }





}
}