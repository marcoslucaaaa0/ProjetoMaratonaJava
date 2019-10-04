package Lclassesabstratas.classes;

public class Vendedor extends Funcionario {
    private double totaldeVendas;


    @Override
    public void imprime(){
        System.out.println("Dentro do metodo  imprime ");
    }
    @Override
    public void calcularSalario() {
        this.salario=salario +(totaldeVendas *0.05);
    }





    public Vendedor(String nome, String clt, double salario, double totaldevendas) {
        super(nome, clt, salario);
        this.totaldeVendas = totaldevendas;
    }

    public double getTotaldeVendas() {
        return totaldeVendas;
    }

    public void setTotaldeVendas(double totaldeVendas) {
        this.totaldeVendas = totaldeVendas;
    }
}
