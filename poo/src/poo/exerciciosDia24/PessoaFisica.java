package poo.exerciciosDia24;
public class PessoaFisica extends Cliente{

    private String RG;

    

    public PessoaFisica(String nome, int idade, String sexo, long cpf, long telefone, String rG) {
        super(nome, idade, sexo, cpf, telefone);
        RG = rG;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }
    
    public void mostrarInfo(){
        System.out.println("\nPessoa Física: "+ getNome() + "\nTem: "+ getIdade() +" anos "+"\nÉ do sexo "+getSexo()
        +"\nN° Cpf: "+ getCpf() +"\nN° RG: " +getRG() + "\nTelefone de numero: "+ getTelefone());

    }


}