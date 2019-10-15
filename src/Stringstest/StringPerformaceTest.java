package Stringstest;

public class StringPerformaceTest {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();
        concatString(50000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto"+(fim-inicio)+"ms");



        inicio = System.currentTimeMillis();
        concatStringBuilder(50000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto"+(fim-inicio)+"ms");


         inicio = System.currentTimeMillis();
        concatStringBuffer(50000);
         fim = System.currentTimeMillis();
        System.out.println("Tempo gasto"+(fim-inicio)+"ms");




    }

    private static void concatString(int tam) {
        System.out.println("aa");
        String  string = "";
        for(int i=0 ; i <tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam) {
        StringBuilder sb = new StringBuilder(tam);
        System.out.println("aa");
        String  string = "";
        for(int i=0 ; i <tam; i++){
            sb.append(i);
        }
    }
    private static void concatStringBuffer(int tam) {
        StringBuffer sbb =  new StringBuffer(tam);
        System.out.println("aa");
        String  string = "";
        for(int i=0 ; i <tam; i++){
            sbb.append(i);
        }
    }
}
