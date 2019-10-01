package Fmodificadoresestaticos.test;


import Fmodificadoresestaticos.classe.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        //for (int parcela : c.getParcelas()) {
          //  System.out.println(parcela + "");
      //  }
        System.out.println("Tamanho da parcela:" + Cliente.getParcelas().length);

    }
}