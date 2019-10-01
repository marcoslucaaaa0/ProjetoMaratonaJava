package metodos.com.br.classe;

import java.util.ArrayList;

public class Calculadora {
    public static void somaDosNumeros() {
        System.out.println(5 + 5);

    }

    public static void subitrairDosNumeros() {
        System.out.println(5 - 5);

    }

    public static void multiplicarDosNumeros(int num1, int num2) {
        System.out.println(num1 * num2);

    }

    public static double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;

        }

        return 0;

    }

    public static void imprimeDoisNumerosDivididos(double num1, double num2) {

        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("erro");

        }
    }

    public static void alterarDoisnumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;
    }
    public static void somaArray(ArrayList<Integer> numeros){
        Integer soma=0;
        for(Integer  num : numeros){

            soma+=num;
        }
        System.out.println(soma);

    }

}

