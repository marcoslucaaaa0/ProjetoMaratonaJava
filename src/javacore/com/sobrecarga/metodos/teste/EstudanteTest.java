package javacore.com.sobrecarga.metodos.teste;

import javacore.com.sobrecarga.metodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("12212", "Carlitos", new double[]{5, 9, 8}," 15/10/1999");
        est.imprimir();

    }
}
