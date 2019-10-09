package RWrappers.test;

public class WrapperTeste {
    public static void main(String[] args) {
/**
 //TiposPrimitivosNumericos
 */
        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10L;
        float floatPrimitivo = 10F;
        double doublePrimitivo = 100.0;


        /**
         //TiposPrimitivos
         */
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;


        /**
         //ClassesWrapper
         */
        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer("10");
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10");
        Double doubleWrapper = 100.0;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = new Boolean("TrUE");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('9'));

    }
}

