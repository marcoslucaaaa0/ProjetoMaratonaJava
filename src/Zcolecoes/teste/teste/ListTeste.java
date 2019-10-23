package Zcolecoes.teste.teste;

import java.util.ArrayList;

public class ListTeste {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        nomes.add("Luca");
        nomes.add("DEvDojo");
        nomes2.add("Julia");
        nomes2.add("DEvDojo2");
//        System.out.println("size; "+ nomes.size());
//        System.out.println(nomes.remove("DEvDojo"));
//        System.out.println("size: "+nomes.size());
        nomes.addAll(nomes2);
        int size = nomes.size();
        for (int i=0; i< size ; i++){
            System.out.println(nomes.get(i));
        }
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        for (Integer num :numeros){
            System.out.println(num);
        }

    }
}
