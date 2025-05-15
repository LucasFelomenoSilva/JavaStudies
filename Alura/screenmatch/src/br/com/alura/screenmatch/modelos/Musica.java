package br.com.alura.screenmatch.modelos;

public class Musica {
    public String titulo;
    public String artista;
    public int anoLancamento;
    public int avaliacao;
    public double numAvaliacoes;

    public void fichaTecnica(){
        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota){
        numAvaliacoes += nota;
        avaliacao++;
    }

    public double media(){
        return numAvaliacoes / avaliacao;
    }
}
