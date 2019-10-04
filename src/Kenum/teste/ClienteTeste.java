package Kenum.teste;

import Kenum.classe.Cliente;
import Kenum.classe.TipoCliente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Juliaa", TipoCliente.PESSOA_JURIDICA,Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(c);
    }
}
