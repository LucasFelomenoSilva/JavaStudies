import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        //meuFilme.setNome("O poderoso chefão");
        //meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadoras(10);
        lost.setEpsodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar 2", 2023);
        //outroFilme.setNome("Avatar 2");
        //outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoLucas = new Filme("Liga da Justiça - Snyder Cut", 2023);
        // filmeDoLucas.setNome("Liga da Justiça - Snyder Cut");
        //filmeDoLucas.setAnoDeLancamento(2023);
        filmeDoLucas.setDuracaoEmMinutos(400);
        filmeDoLucas.avalia(7);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(filmeDoLucas);
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Primeiro filme: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());


        System.out.println("\n-----------------------------------");

        Pessoa pessoa = new Pessoa();
        pessoa.saudacao();

        System.out.println("\n-----------------------------------");

        Musica musica = new Musica();
        musica.titulo = "God's Plan";
        musica.artista = "Drake";
        musica.anoLancamento = 2018;
        musica.avalia(8);
        musica.avalia(9);
        musica.avalia(10);
        musica.fichaTecnica();
        System.out.println(musica.avaliacao);
        System.out.println(musica.numAvaliacoes);
        System.out.println(musica.media());

        System.out.println("\n-----------------------------------");

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.fichaTecnica();

        System.out.println("Idade do carro: " + meuCarro.calcularIdade() + " anos");

        System.out.println("\n-----------------------------------");

        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Lucas";
        meuAluno.idade = 21;

        meuAluno.exibeInformacoes();
    }
}

