package poo.exemplosAula27;

public class TesteEmpregado1 {
    public static void main(String[] args) {
        
        Empregado1 renan = new Empregado1("renan goncalves ", "R. da marola n°99 ", 
        "27889911103 ", 948383838, 22, 322, 9800, 15);

        renan.imprimirInfo();
        renan.calcularSalario();
    }
    
}
