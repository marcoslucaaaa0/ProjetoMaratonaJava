package ZZAGenerics.test.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        //type erasure
        List<String>lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Marcos Luca");

        for(String obj : lista){
            System.out.println(obj);
        }
       add(lista,1L);

    }
    public static  void  add(List lista, long l){
        lista.add(1);
    }
}
