package metodos.com.br.teste;

import metodos.com.br.classe.Calculadora;

import java.util.ArrayList;
import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDosNumeros();
        calc.subitrairDosNumeros();
        calc.multiplicarDosNumeros(5, 5);
        System.out.println("Divisao de dois numeros :");
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("imprime dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20, 8);
        System.out.println("Continuar a execução");
        ArrayList<Integer> numeros = new ArrayList<Integer>() {{
            addAll(Arrays.asList(1, 2, 3, 4, 5));

        }};
        calc.somaArray(numeros);

    }
}
