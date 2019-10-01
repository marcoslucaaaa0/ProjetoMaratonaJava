package javacore.com.Gassociação.classes.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print() {
        System.out.println("----------Relatorio de Seminario---------");
        System.out.println("Titulo" + this.titulo);
        System.out.println("Professor palestrante : " + this.professor.getNome());
        if (this.local != null)
            System.out.println("Local , rua " + this.local.getRua() + "Bairro" + this.local.getBairro());
        else
            System.out.println("Nenhum local cadastro para esse seminario");
        if (alunos != null && alunos.length != 0) {
            System.out.println("---Alunos participantes---");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
            return;
        }
        System.out.println("Nenhum aluno cadastrado");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

}
