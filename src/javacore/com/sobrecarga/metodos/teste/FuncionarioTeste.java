package javacore.com.sobrecarga.metodos.teste;

import javacore.com.sobrecarga.metodos.classes.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Julia", "104.437.865-31", 10000, "36111797");
        Funcionario funcionario2 = new Funcionario("Luca", "104.437.865-42", 30000, "36111587");

        System.out.println("======================================================================================");
        funcionario.imprime();
        System.out.println("======================================================================================");
        funcionario2.imprime();
        System.out.println("======================================================================================");
    }

}
