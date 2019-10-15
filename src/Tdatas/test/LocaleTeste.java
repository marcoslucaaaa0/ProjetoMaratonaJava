package Tdatas.test;

import org.w3c.dom.ls.LSOutput;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 *  COMO OBTER UMA LOCALIZAÇÃO
 */
//1 -baseado no sistema
//2- numa requisição via web
//3- uma localização baseada na escolha do usuario

public class LocaleTeste {
    public static void main(String[] args) {
        Locale locItaly = new Locale("it", "IT");
        Locale locSuica = new Locale("it", "CH");
        Locale locIndia = new Locale("hi", "IN");
        Locale locJapao = new Locale("Ja");

        Calendar c = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapao);

        System.out.println("Italia"+ df.format(c.getTime()));
        System.out.println("Suica"+ df.format(c.getTime()));
        System.out.println("India"+ df.format(c.getTime()));
        System.out.println("Joao"+ df.format(c.getTime()));
        //1.000,00 . 1,000.00
        System.out.println(locItaly.getDisplayLanguage(locItaly));
        System.out.println(locIndia.getDisplayLanguage(locIndia));
        System.out.println(locJapao.getDisplayLanguage(locJapao));
    }

}
