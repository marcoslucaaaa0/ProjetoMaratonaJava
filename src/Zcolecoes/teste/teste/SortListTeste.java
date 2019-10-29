package Zcolecoes.teste.teste;

import java.util.ArrayList;
import java.util.Collections;

public class SortListTeste {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Julia");
        nomes.add("Gomes");
        nomes.add("Marcos");
        nomes.add("Luca");
        nomes.add("Beca");
        nomes.add("Felipe");
        nomes.add("Larissa");
        nomes.add(0,"Ana");
        Collections.sort(nomes);
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        Collections.sort(numeros);
        for (String nome:nomes){
            System.out.println(nome);
        }
        for(Double numero : numeros){
            System.out.println(numeros);
        }

    }
}
