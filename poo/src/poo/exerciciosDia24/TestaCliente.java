package poo.exerciciosDia24;

public class TestaCliente {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Marcos Silva", 31 , "Masculino ", 
        1234567890-1, 1112345678);
        cliente1.visualisar();

        Cliente cliente2 = new Cliente("João Rezende", 25 , "Masculino ", 
        987654321-0, 1134556755);
        cliente2.visualisar();

        PessoaFisica pessoaF1 = new PessoaFisica("Maria Clara ",  21 , "Feminino" ,
         1234567897-7 , 1234444444 , "12734509");
         pessoaF1.mostrarInfo();

         PessoaFisica pessoaF2 = new PessoaFisica("Natalia Ribeiro ",  63 , "Feminino" ,
         1234567897-2 , 1235555555 , "098765432");
         pessoaF2.mostrarInfo();

         PessoaJuridica pessoaJ1 = new PessoaJuridica("Vanessa Santos", 42,
          "Feminino", 1236666663-1, 123459999, "743696230001");
          pessoaJ1.exibirInfo();

          PessoaJuridica pessoaJ2 = new PessoaJuridica("Bruno Almeida", 51,
          "Masculino", 1234567891-0, 123456789, "743696230001");
          pessoaJ2.exibirInfo();
  
    }
}
