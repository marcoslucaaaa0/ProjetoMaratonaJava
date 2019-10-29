package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearchTest {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
//        (-(ponto de inserção)-1),-1 -1= -2)
        Collections.sort((numeros));
//        0,1,2,3
//        0,2,3,4
        System.out.println(Collections.binarySearch(numeros,1));

        ArrayList<Produto>produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0);
        Produto produto2 = new Produto("321", "picanha", 26.0);
        Produto produto3 = new Produto("879", "Laptop lenovo", 1000.0);
        Produto produto4 = new Produto("123", "Laptop lenovo", 3200.0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos,new ProdutoNomeComparator());
        Produto produto5=new Produto("000","HDMI", (double) 50);

        for(Produto produto : produtos){
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos,produto5,new ProdutoNomeComparator()));
        Integer[]arrayInteger = new Integer[4];
        arrayInteger[0]=2;
        arrayInteger[1]=0;
        arrayInteger[2]=4;
        arrayInteger[3]=3;
        Arrays.sort((arrayInteger));
        System.out.println(Arrays.binarySearch(arrayInteger,1));




    }
}
