package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public Aluno(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
