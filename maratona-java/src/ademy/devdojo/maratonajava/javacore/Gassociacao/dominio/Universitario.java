package ademy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Universitario {
    private String nome;
    private Faculdade faculdade;

    public Universitario(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public Faculdade getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(Faculdade faculdade) {
        this.faculdade = faculdade;
    }
}
