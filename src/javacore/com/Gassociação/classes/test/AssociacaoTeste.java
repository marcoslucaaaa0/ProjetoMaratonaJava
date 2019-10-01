package javacore.com.Gassociação.classes.test;

import javacore.com.Gassociação.classes.classes.Aluno;
import javacore.com.Gassociação.classes.classes.Local;
import javacore.com.Gassociação.classes.classes.Professor;
import javacore.com.Gassociação.classes.classes.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Aluno aluno  = new Aluno(" Luca ",19);
        Aluno aluno2  = new Aluno(" Marcos ",22);

        Seminario sem = new Seminario("Como ser um baita programador e ficar Rico");
        Professor prof =new Professor(" Yoda","Usar a Força para programar");
        Local local = new Local("  das araras "," mata dos cocais");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        aluno.print();

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno,aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0]= sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();
        local.print();






    }
}
