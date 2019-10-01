package metodos.com.br.teste;

import metodos.com.br.classe.Calculadora;

public  class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Calculadora pulc = new Calculadora();
   int num1=5;
   int num2=10;
   calc.alterarDoisnumeros(num1,num2);
        System.out.println("Dentro do teste...");
        System.out.println("Numero1:"+num1);
        System.out.println("Numero2:"+num2);

    }
}
