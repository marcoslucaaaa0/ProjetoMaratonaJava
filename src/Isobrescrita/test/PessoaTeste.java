package Isobrescrita.test;

import Isobrescrita.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Julia");
        System.out.println("!!!!!!!!!!!!!!!!!!!!");
        p.setIdade(14);
        System.out.println(p);
        System.out.println("------------------------");
        Pessoa p1 = new Pessoa();
        p1.setNome("Luca");
        p1.setIdade(19);
        System.out.println(p1);
    }
}
