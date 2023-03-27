package poo.exemplosAula27;

public class Empregado1 extends Pessoa {
  
private int codigoSetor;
   private float salarioBase;
   private float imposto;

public Empregado1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase,
        float imposto) {
    super(nome, endereco, cpf, telefone, idade); // super classe;
    this.codigoSetor = codigoSetor;
    this.salarioBase = salarioBase;
    this.imposto = imposto;
}

public int getCodigoSetor() {
    return codigoSetor;
}

public void setCodigoSetor(int codigoSetor) {
    this.codigoSetor = codigoSetor;
}

public float getSalarioBase() {
    return salarioBase;
}

public void setSalarioBase(float salarioBase) {
    this.salarioBase = salarioBase;
}

public float getImposto() {
    return imposto;
}

public void setImposto(float imposto) {
    this.imposto = imposto;
}

 public void imprimirInfo(){
    System.out.println("\nNome do empregade: "+getNome()+"\nCPF: "+getCpf()+"\nIdade: "
    +getIdade()+ "\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()+"\nCodigo Setor: "+getCodigoSetor()+ "\nSalario Base "
    +getSalarioBase()+"Valor em porcentagem(sem o %)do imposto a ser retirado do salario "+getImposto());
 } 
 public void calcularSalario(){
    double salarioTotal = salarioBase -(salarioBase * (imposto/100));
    System.out.println("\n O salario total a ser recebido pelo empregado"
    +getNome()+ " é igual a: "+salarioTotal);
 }
    
}
