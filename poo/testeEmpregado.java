package poo;

public class testeEmpregado {
    public static void main(String[] args) {
        
        empregado[] lista = new empregado[3];

        lista[0] = new empregado("Beatriz Angelita", 15000);
        lista[1] = new empregado("Júlia Guarnieri", 50000);
        lista[2] = new empregado("William Reis", 10000);

        for (empregado roda: lista) {
            roda.imprimir();
        }
        System.out.println("*********************************************");
        for (empregado roda : lista) {
            roda.aumentarSalario(10);
            roda.imprimir();
        }
    }
    
}
