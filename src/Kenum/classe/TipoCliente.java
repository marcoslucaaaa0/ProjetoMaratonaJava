package Kenum.classe;
//constant specific class body
//corpo de classe especifico constante

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
    public String getId() {
        return "B";
    }
};

private  int tipo;
private String nome;

TipoCliente(int tipo,String nome){
    this.tipo = tipo;
    this.nome = nome;
}
    public String getId(){
    return "A";
    }

    public int getTipo() {
        return tipo;
    }
}

