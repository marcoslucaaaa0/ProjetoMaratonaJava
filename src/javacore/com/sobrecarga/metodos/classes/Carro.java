package javacore.com.sobrecarga.metodos.classes;

public class Carro {
    private String nome;
    private double velociadeMaxima;
    private static double velocidadeLimite = 240;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velociadeMaxima = velocidadeMaxima;
    }
public void imprime(){
    System.out.println("--------------------------");
    System.out.println("Tipo:"+this.nome);
    System.out.println("VelocidadeMAX:"+this.velociadeMaxima);
    System.out.println("VelocidadeLimite:"+this.velocidadeLimite);

}


    public Carro() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelociadeMaxima() {
        return velociadeMaxima;
    }

    public void setVelociadeMaxima(double velociadeMaxima) {
        this.velociadeMaxima = velociadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}

