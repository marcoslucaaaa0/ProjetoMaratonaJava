package javacore.com.Gassociação.classes.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("----------Relatorio de Professor---------");
        System.out.println("Nome do professor :" + this.nome);
        System.out.println("Especialidade :" + this.especialidade);
        if (seminarios != null && seminarios.length != 0) {
            System.out.print("Seminámiros participantes : ");
            for (Seminario sem : seminarios) {
                System.out.println(sem.getTitulo() + " ");
            }
            return;
        }
        System.out.println("o Professor nao vinculado a nenhum seminario");
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
