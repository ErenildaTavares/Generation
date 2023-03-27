package poo.exerciciosDia24;

public class Cliente {
    private String nome;
    private int idade;
    private String sexo;
    private long cpf;
    private long telefone;

    public Cliente(String nome, int idade, String sexo, long cpf, long telefone) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void visualisar() {
        System.out.println("\ncliente: " + nome + "\nTem " + idade + " anos " + "\nÉ do sexo "
         + sexo+"\nN° CPF " +cpf+"\n N° de telefone: "+telefone );
    }

}
