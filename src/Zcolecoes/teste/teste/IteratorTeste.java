package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTeste {
    public static void main(String[] args) {

        List<Produto> produtos = new LinkedList<>();
        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0,10);
        Produto produto2 = new Produto("321", "picanha", 26.0,10);
        Produto produto3 = new Produto("879", "Laptop lenovo", 1000.0,0);
        Produto produto4 = new Produto("123", "Laptop lenovo", 3200.0,0);
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Iterator<Produto> produtoInterator = produtos.iterator();
        //hasNext()://next();
        while (produtoInterator.hasNext()){
            if ((produtoInterator.next().getQuantidade()==0)){
                produtoInterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
