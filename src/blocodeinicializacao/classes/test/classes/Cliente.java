package blocodeinicializacao.classes.test.classes;

public class Cliente {

    private int[] parcelas;

    {
        parcelas = new int[100];

        System.out.println("Dentro do construtor");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {

    }


    private int[] parcelas() {
        return new int[0];
    }


    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }

}

