package metodos.com.br.teste;

import metodos.com.br.classe.Estudante;

import java.util.ArrayList;
import java.util.Arrays;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setIdade(19);
        estudante.setNome("Marcos");
        estudante.setNotas(new double[]{8,7,9,5});
        estudante.print();
        estudante.tirarMedia();
        estudante.isAprovado();
        System.out.println("Aprovado?? " + estudante.isAprovado());







    }
}
