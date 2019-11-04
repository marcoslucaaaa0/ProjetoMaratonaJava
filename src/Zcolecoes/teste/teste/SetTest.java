package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0,10);
        Produto produto2 = new Produto("321", "picanha", 26.0,10);
        Produto produto3 = new Produto("879", "Laptop Asus", 2000.0,0);
        Produto produto4 = new Produto("123", "Laptop Sansumg", 4200.0,0);
        Produto produto5 = new Produto("153", "Laptop lenovo", 3200.0,0);
        Set<Produto>produtoSet=new LinkedHashSet<>();
        //Set<Produto>produtoSet=new HashSet<>();
        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);
        for(Produto p: produtoSet){
            System.out.println(p);
        }
    }
}
