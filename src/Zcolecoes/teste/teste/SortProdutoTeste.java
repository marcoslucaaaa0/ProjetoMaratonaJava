package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Produto;

import java.util.ArrayList;
import java.util.Collections;

public class SortProdutoTeste {
    public static void main(String[] args) {
        ArrayList<Produto>produtos = new ArrayList<>();
        Produto produto1=new Produto("123","Laptop lenovo",2000.0);
        Produto produto2=new Produto("321","picanha",26.0);
        Produto produto3=new Produto("879","Laptop lenovo",1000.0);
        Produto produto4=new Produto("123","Laptop lenovo",3200.0);
       produtos.add(produto1);
       produtos.add(produto2);
       produtos.add(produto3);
       produtos.add(produto4);
        Collections.sort(produtos);
        for (Produto produto:produtos){
            System.out.println(produto);
        }


    }

}
