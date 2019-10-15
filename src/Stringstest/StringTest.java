package Stringstest;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Willian ";
        nome = nome.concat(" Souza");
        String nome2 = "Willian";
        //1 variavel de referencia,2-Um objeto do tipo string, 3- Uma string no pool de String
        String nome3 = new String("Catarina");
        String teste = "Goku";
        String teste2 = "0123456789";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace("a","o"));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());
    }
}
