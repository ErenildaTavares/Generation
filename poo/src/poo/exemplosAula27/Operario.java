package poo.exemplosAula27;

public class Operario extends Pessoa {

    private double valorProducao;
    private double comissao;
    public Operario(String nome, String endereco, String cpf, int telefone, int idade, double valorProducao,
            double comissao) {
        super(nome, endereco, cpf, telefone, idade);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }
    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public void imprimirInfo(){
        System.out.println("\nNome do empregade: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "
        +getIdade()+ "\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()+"\nValor total dos artigos produzidos por: "+getNome()+":" + valorProducao+ "\nporcentagem(sem o %)da comissao desse artigo "+comissao);
     }

     public void calcularValorArtigo(){
        double valor_Total = valorProducao + (valorProducao* (comissao/100));
        System.out.println("\nO valor total a ser recebido pelo operario "+getNome()+ 
        "é igual a: "+ valor_Total);
     }

    
}
