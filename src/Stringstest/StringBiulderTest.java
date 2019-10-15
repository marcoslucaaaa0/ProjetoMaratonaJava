package Stringstest;

public class StringBiulderTest {
    public static void main(String[] args) {
        String s = "Uma frase comum";
        StringBuilder ab = new StringBuilder(16);
        ab.append("def").insert(3, "ghi").reverse().delete(2, 4);
        System.out.println(ab);
    }
}

