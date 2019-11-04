package ZZAGenerics.test.classes;

public class Computador {
    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
