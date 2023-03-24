package poo.exemplosAula24;

import java.text.NumberFormat;

public class empregado {
    private String nome;
    private double salario;
    public empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;   
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void aumentarSalario(double percentual){
        salario *= 1 + percentual /100;
    }

    public String formatarMoeda(){

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMaximumFractionDigits(2);
        String formatoMoeda = nf.format(salario);
        return formatoMoeda;
    }
   public void imprimir(){
    System.out.println(nome+ " \t\t\tSalário: "+this.formatarMoeda());
   }
}


