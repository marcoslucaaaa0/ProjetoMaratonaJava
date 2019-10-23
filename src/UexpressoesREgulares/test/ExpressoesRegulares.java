package UexpressoesREgulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        // \d - todos os digitos
        // \D tudo o que nao for digito
        // \s espaços em branco \t \r \f \ n
        // \S espaços que nao sao brancos
        // \w caracteres de palavras a-z A-Z, diitos e _
        // \W tudo que nao for caractere de palavras
        // [] especifica o que voce quer
        //? ( zero ou uma ) ocorrencia
        //* ( zero ou mais ) ocorrencias
        //+( uma ou mais ) ocorrencias
        //[n,m] (de n ate m)  ocorrencias
        // ()  (Agrupar)
        // |   (ou)
        // $   (fim de linha)
        // .coringa 1.3 = 123,133,1A3,1#3,1 3
        int hex = 0x1;
//        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
//        String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";//"([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"
//        String texto = "fulano@hotmail.com,102Abc@mail.com,#@!abrao@mail.br,teste@gmail.com.br,teste@mail";
        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/05"; // dd//MM/yyyy


        System.out.println("E-mail valido"+ "#@!abrao@gmail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto " + texto);
        System.out.println("indice : 0123445678901234567");
        System.out.println("expressao " + matcher.pattern());
        System.out.println("posicoes encontradas :");
        while (matcher.find()) {
            System.out.println(matcher.start() +" "+ matcher.group());
        }

    }
}
