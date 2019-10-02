package herança.com.br.semge.test;
import herança.com.br.semge.classes.Endereco;
import herança.com.br.semge.classes.Funcionario;
import herança.com.br.semge.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Julia");
        Endereco end = new Endereco();
        p.setCpf("104437865");
        end.setBairro("Bairro 1");
        end.setRua("Rua 25");
        p.setEndereco(end);
        p.imprime();

        Funcionario f = new Funcionario("Luca");
        f.setCpf("10876504");
        f.setSalario(15000);
        f.setEndereco(end);
        System.out.println("---------------------------------------");
        f.imprime();

    }
}
