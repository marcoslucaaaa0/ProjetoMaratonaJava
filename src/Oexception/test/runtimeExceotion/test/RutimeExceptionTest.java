package Oexception.test.runtimeExceotion.test;

public class RutimeExceptionTest {
    public static void main(String[] args) {
        divisao(10, 0);
    }

    private static void divisao(int num1, int num2) {
        if (num2 == 0) {
            try {
                throw new IllegalAccessException("Passe um valor diferente de 0  para num2...");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        int result = num1 / num2;
        System.out.println(result);
    }
}
