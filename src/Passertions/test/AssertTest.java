package Passertions.test;

public class AssertTest {
    public static void main(String[] args) {
        calculaSalario(-1000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0):"O salario nao deve ser menor que zero, o salario veio: "+salario;
        //calculo do salario
    }

    public static void calcSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        }
    }
}

