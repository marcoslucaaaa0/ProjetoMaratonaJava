package Zcolecoes.teste.teste;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String>map=new LinkedHashMap<>();
        map.put("teklado","telado");
        map.put("mouze","mouse");
        map.put("vc","você");
        map.put("Meza","Mesa");
//        for(String key : map.values()){
//            System.out.println(key);
//        }
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
