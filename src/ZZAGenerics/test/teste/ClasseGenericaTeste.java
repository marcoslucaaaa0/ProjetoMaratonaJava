package ZZAGenerics.test.teste;

import ZZAGenerics.test.classes.Carro;
import ZZAGenerics.test.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando Carro por um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("------------------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("HP"));
        ObjetosAlugaveis<Computador>computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador c =computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando computador");
        computadorAlugavel.devolverObjeto(c);
    }
}
//Type
    class ObjetosAlugaveis<T> {
        private List<T> objetosDisponiveis;

public ObjetosAlugaveis(List<T> objetosDisponiveis){
    this.objetosDisponiveis=objetosDisponiveis;
}
        //Alugar
        public T getObjetoDisponivel() {
            T t = objetosDisponiveis.remove(0);
            System.out.println("Alugando objetos:" + t);
            System.out.println("objetos disponiveis: " + objetosDisponiveis);
            return t;
        }

        public void devolverObjeto(T t) {
            System.out.println("Devolvendo objetos:" +t);
           objetosDisponiveis.add(t);
            System.out.println("Objetos disponiveis: " + objetosDisponiveis);
        }
    }
class DoisAtributos<T,X> {
    T um;
    X dois;

    public DoisAtributos(T um, X dois) {
        this.um = um;
        this.dois = dois;
    }

    public T getUm() {
        return um;
    }

    public void setUm(T um) {
        this.um = um;
    }

    public X getDois() {
        return dois;
    }

    public void setDois(X dois) {
        this.dois = dois;
    }
}