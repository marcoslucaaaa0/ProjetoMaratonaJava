package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Consumidor;
import Zcolecoes.teste.classes.Produto;

import java.util.*;

public class ConsumidorMapTest {
    public static void main(String[] args) {

        Consumidor consumidor = new Consumidor("Julia", "3578129");
        Consumidor consumidor2 = new Consumidor("Luca", "3678427");
        Consumidor consumidor3 = new Consumidor("Dear", "3875122");

        Produto produto1 = new Produto("123", "Laptop lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "picanha", 26.0, 10);
        Produto produto3 = new Produto("879", "Laptop Asus", 2000.0, 0);
        Produto produto4 = new Produto("123", "Laptop Sansumg", 4200.0, 0);
        Produto produto5 = new Produto("153", "Laptop lenovo", 3200.0, 0);
        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(produto1);
        produtosCon1.add(produto2);
        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(produto3);
        produtosCon2.add(produto4);

        map.put(consumidor, produtosCon1);
        map.put(consumidor2, produtosCon2);
        map.put(consumidor3, produtosCon1);
        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
