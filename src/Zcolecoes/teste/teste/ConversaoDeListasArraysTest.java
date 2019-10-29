package Zcolecoes.teste.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaoDeListasArraysTest {
    public static void main(String[] args) {
        ArrayList<Integer>numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Integer[]numeroArrray= new Integer[numeros.size()];
        numeros.toArray(numeroArrray);
        System.out.println(numeros);
        System.out.println(Arrays.toString(numeroArrray));
        System.out.println("--------------------");
        Integer[] numerosArray2= new Integer[4];
        numerosArray2[0]=10;
        numerosArray2[1]=9;
        numerosArray2[2]=8;
        numerosArray2[3]=7;
        List<Integer> numeros2= Arrays.asList(numerosArray2);

        ArrayList<Integer>numeros3= new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArray2));

        numeros2.set(0,1);
        numeros3.add(10);
        System.out.println(Arrays.toString(numerosArray2));
        System.out.println(numeros2);
        System.out.println(numeros3);
    }
}
