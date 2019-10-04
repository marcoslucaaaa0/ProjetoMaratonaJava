package Jmodificadorfinal.classes;

public class Carro {
    private String nome;
    private String marca;
    private static final double VELOCIDADE_FINAL = 250;
    private final Comprador comprador=new Comprador();


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    public  final void imprime(){

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static double getVelocidadeFinal() {
        return VELOCIDADE_FINAL;
    }

    public Comprador getComprador() {
        return comprador;
    }
}


