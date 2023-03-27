package poo.exerciciosDia24;

public class PessoaJuridica extends Cliente {
    private String cnpj;

    public PessoaJuridica(String nome, int idade, String sexo, long cpf, long telefone, String cnpj) {
        super(nome, idade, sexo, cpf, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void exibirInfo(){
        System.out.println("\nPessoa Jurídica: "+ getNome() + "\nTem: "+ getIdade() +" anos "
        +"\nÉ do sexo "+getSexo() +"\nN° CNPJ: " +getCnpj() + "\nTelefone de numero: "+ getTelefone());
    }
    

}
