package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Faculdade {
    private String nome;
    private Universitario[] universitarios;

    public Faculdade(String nome){
        this.nome = nome;
    }

    public Faculdade(String nome, Universitario[] universitarios){
        this.nome = nome;
        this.universitarios = universitarios;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (universitarios == null){
            return;
        }
        for (Universitario universitario : universitarios ){
            System.out.println(universitario.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public Universitario[] getUniversitarios() {
        return universitarios;
    }

    public void setUniversitarios(Universitario[] universitarios) {
        this.universitarios = universitarios;
    }
}
