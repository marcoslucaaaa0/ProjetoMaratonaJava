package Npolimorfismo.classes;

public class RelatorioPagamento {

    //    public void relatorioPagamento(Gerente gerente) {
//        System.out.println("Gerendo relatorio de pagamento para o Gerente...");
//        gerente.calcularPagamento();
//        System.out.println("Nome : " + gerente.getNome());
//        System.out.println("Salario do mês: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamento(Vendedor vendedor) {
//        System.out.println("Gerendo relatorio de pagamento ...");
//        vendedor.calcularPagamento();
//        System.out.println("Nome : " + vendedor.getNome());
//        System.out.println("Salario do mês: " + vendedor.getSalario());
//
//
//    }
    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerendo relatorio de pagamento ...");
        funcionario.calcularPagamento();
        System.out.println("Nome : " + funcionario.getNome());
        System.out.println("Salario do mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente g = (Gerente) funcionario;
            System.out.println("participação nos lucros:" + g.getPnl());
        }
        if (funcionario instanceof Vendedor){
            System.out.println("Total vendas :"+((Vendedor) funcionario).getTotalVendas());
        }
    }
}
