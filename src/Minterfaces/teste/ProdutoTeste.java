package Minterfaces.teste;

import Minterfaces.classes.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p= new Produto("Notebook",5,2900);
        p.calcularImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}
