package Oexception.test.teste;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTeste {
    public static void main(String[] args) {
        abrirArquivo();
    }

    public static void criarArquivo() {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo recriado" + file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Arquivo recriado");

    }

    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new Exception
            System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }

    }
}
