package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;

    public Aluno(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
