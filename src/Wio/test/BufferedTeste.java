package Wio.test;

import java.io.*;

public class BufferedTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
             BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no arquivo ");
            bw.newLine();
            bw.write("pulando uma linha");
            bw.flush();
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
