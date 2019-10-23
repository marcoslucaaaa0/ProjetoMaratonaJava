package Zcolecoes.teste.teste;

import Zcolecoes.teste.classes.Celular;

import java.awt.*;
import java.util.ArrayList;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S10", "123456");
        Celular celular2 = new Celular("Iphone X", "901821");
        Celular celular3 = new Celular("Xiaomi Mi 8", "019212");
        ArrayList<Celular> celularArrayList = new ArrayList<>();
        celularArrayList.add(celular1);
        celularArrayList.add(celular2);
        celularArrayList.add(celular3);

        for (Celular celular :celularArrayList){
            System.out.println(celular);

        }
        Celular celular4 = new Celular("Galaxy S10", "123456");
    }
}
