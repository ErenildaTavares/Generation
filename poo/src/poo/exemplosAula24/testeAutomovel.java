package poo.exemplosAula24;

public class testeAutomovel {
    public static void main(String[] args) {
        //instanciando um objeto da classe Automovel.

        Automovel auto1 = new Automovel("\nBruna ", "Kombi ", "NOA2008 ", 1998);
        auto1.imprimirInfo();

        System.out.println("\nTranferrencia de proprietário");

        auto1.setNomeProprietario("\nLarissa Pimenta");
        auto1.imprimirInfo();

        System.out.println("\nMudança de placa");

        auto1.setPlaca("ABC8888");
        auto1.imprimirInfo();
        
    }
}
