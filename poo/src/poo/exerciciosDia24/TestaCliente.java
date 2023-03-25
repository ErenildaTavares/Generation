package poo.exerciciosDia24;

public class TestaCliente {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("\nMarcos", 31 , "Masculino ", 
        1234567890-1, 1112345678);
        cliente1.visualisar();

        Cliente cliente2 = new Cliente("\nJoão", 25 , "Masculino ", 
        987654321-0, 1134556755);
        cliente2.visualisar();
    }
}
