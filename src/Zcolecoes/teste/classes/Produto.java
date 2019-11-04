package Zcolecoes.teste.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private  String serialNumber;
    private  String nome;
    private  Double preço;
    private int quantidade;


    public Produto(String serialNumber, String nome, Double preço) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preço = preço;

    }

    public Produto(String serialNumber, String nome, Double preço, int quantidade) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return serialNumber != null ? serialNumber.equals( produto.serialNumber): produto.serialNumber==null; }

    @Override
    public int hashCode() {
        return serialNumber != null ? serialNumber.hashCode():0;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber='" + serialNumber + '\'' +
                ", nome='" + nome + '\'' +
                ", preço=" + preço +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreço() {
        return preço;
    }

    public void setPreço(Double preço) {
        this.preço = preço;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        //negativo se thisObject < outroObjeto
        //zero se thisObject==outroObjeto
        //Positivo se thisObject>outroObjeto
        Double d = preço;
        return  d.compareTo(outroObjeto.getPreço());
    }
}
