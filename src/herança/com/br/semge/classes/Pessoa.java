package herança.com.br.semge.classes;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
    }

    {
        System.out.println("Bloco de inicialização estático");
    }

    {
        System.out.println("Bloco de inicialização");

        System.out.println("Bloco de inicialização");
    }

    public Pessoa(String nome, String cpf) {
        this(nome);
        this.cpf = cpf;
    }

    public Pessoa(String nome) {
        this.nome = nome;

    }

    public Pessoa() {

    }

    public void imprime() {
        System.out.println("Nome :" + this.nome);
        System.out.println("CPF :" + this.cpf);
        System.out.println("Endereço : " + this.endereco.getRua());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
