package ZZAGenerics.test.teste;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
    }
    public  static < T extends  Animal> void criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
