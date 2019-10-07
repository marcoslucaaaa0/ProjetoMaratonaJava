package Npolimorfismo.teste;

import Npolimorfismo.classes.Funcionario;
import Npolimorfismo.classes.Gerente;
import Npolimorfismo.classes.RelatorioPagamento;
import Npolimorfismo.classes.Vendedor;


public class PolismorfismoTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2500);
        Vendedor v = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
//        relatorio.relatorioPagamento(g);
//        System.out.println("-----------------------------");
//        relatorio.relatorioPagamento(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("-----------------------------");
        relatorio.relatorioPagamentoGenerico(v);


    }
}
