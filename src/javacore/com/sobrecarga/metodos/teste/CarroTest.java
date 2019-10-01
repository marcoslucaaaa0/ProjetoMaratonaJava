package javacore.com.sobrecarga.metodos.teste;

import javacore.com.sobrecarga.metodos.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro();
        Carro car1=new Carro( "Ford", 200);
        Carro car2=new Carro("Audi", 215);
        Carro car3=new Carro("BMW", 222);
        Carro car4=new Carro("Mercedes", 212);
        System.out.println("//////////////////////////////////////////");
        Carro.setVelocidadeLimite(220);
        car1.imprime();
        car2.imprime();
        car3.imprime();
        car4.imprime();



    }

}
