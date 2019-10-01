package metodos.com.br.classe;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public double[] getNotas() {
        return notas;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void print() {

        System.out.println("Nome :" + this.nome);
        System.out.println("Idade :" + this.idade);
        if (this.notas != null) {
            for (double nota : notas) {
                System.out.println("Nota :" + nota + " ");

            }
        }
    }
        public void tirarMedia () {
            if (notas == null) {
                System.out.println("Esse aluno nao possui notas");
                return;
            }
            double media = 0;

            for (double nota : this.notas) {
                media += nota;
            }

            media = media / notas.length;
            if (media > 6) {
                System.out.println("\nA media é: " + media + "\nsituação : aprovado");
                this.aprovado=true;
            } else {
                System.out.println("\nA media é:" + media + "\nsituação : reprovado");
                this.aprovado=false;
            }
        }

    }


