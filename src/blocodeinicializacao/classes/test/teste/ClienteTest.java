package blocodeinicializacao.classes.test.teste;

import blocodeinicializacao.classes.test.classes.Cliente;

import java.util.ArrayList;
import java.util.Arrays;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : c.getParcelas()) {
            System.out.println(parcela + "");
        }
    }
}