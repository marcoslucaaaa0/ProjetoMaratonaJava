package javacore.com.sobrecarga.metodos.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    public Estudante(String matricula, String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }

    public Estudante(String matricula, String nome, double[] notas, String datamatricula) {
        this(matricula, nome, notas);
        this.dataMatricula = datamatricula;

    }

    public String getDatamatricula() {
        return dataMatricula;
    }

    public void setDatamatricula(String datamatricula) {
        this.dataMatricula = datamatricula;
    }

    public Estudante() {

    }

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.dataMatricula);
        for (double nota : notas) {
            System.out.println(nota + "");
        }

    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}

