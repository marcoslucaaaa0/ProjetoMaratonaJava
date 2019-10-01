package Fmodificadoresestaticos.classe;

public class Cliente {
//0 - Bloco de inicialização estatico é executado quando a JVM carregar a classe(é executado apenas 1 vez)
//1 - Alocando espaço na memoria para o objeto que será criado
//2- cada atributo de classe é criado e inicalizado com seus valores default ou valores explicitos
//3- Bloco de inicialização é executado
//4- O construtor é exucatado
    private static int[] parcelas;
    static {
        parcelas = new int[100];

        System.out.println("Dentro do construtor bloco de inicialização");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }


    private static int[] parcelas() {
        return new int[0];
    }


    public static int[] getParcelas() {
        return parcelas;
    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

}

