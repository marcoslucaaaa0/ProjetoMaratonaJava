package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Produto;

import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "picanha", 26.0, 10);
        Produto produto3 = new Produto("879", "Laptop Asus", 2000.0, 0);
        Produto produto4 = new Produto("123", "Laptop Sansumg", 4200.0, 0);
        Produto produto5 = new Produto("153", "Laptop lenovo", 3200.0, 0);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);
        for (Produto produto : produtoNavigableSet) {
            System.out.println(produto);
        }
        //for(Produto produto: produtoNavigableSet.descendingSet()){
//            System.out.println(produto);
//        }
        System.out.println("----------------------------------------");
        //lover <
        //floar <=
        //higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.ceiling(produto5));
//        System.out.println(produtoNavigableSet.size());
//        System.out.println(produtoNavigableSet.pollFirst());
//        System.out.println(produtoNavigableSet.size());

    }
}
