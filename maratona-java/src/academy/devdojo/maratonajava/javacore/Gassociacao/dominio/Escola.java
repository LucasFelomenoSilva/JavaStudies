package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professores;
    private Aluno[] alunos;

    public Escola(String nome){
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores, Aluno[] alunos) {
        this.nome = nome;
        this.professores = professores;
        this.alunos = alunos;
    }

    public void imprime(){
        System.out.println("Escola: " + this.nome);
        if (professores == null) return;
        int i = 1;
        for (Professor professor : professores) {
            System.out.println("Professor " + i + " : " + professor.getNome());
            i++;
        }
        int j = 1;
        for (Aluno alunos : alunos){
            System.out.println("Aluno " + j + " : " + alunos.getNome());
            j++;
        }
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Professor[] getProfessores(){
        return professores;
    }

    public void setProfessores(Professor[] professores){
        this.professores = professores;
    }
}
