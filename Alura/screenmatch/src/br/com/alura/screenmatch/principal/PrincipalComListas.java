package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        outroFilme.avalia(6);
        Filme filmeDoLucas = new Filme("Liga da Justiça - Snyder Cut", 2023);
        filmeDoLucas.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoLucas;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoLucas);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação do " + filme.getNome() + " : " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Robert Downey Jr.");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Ordenado: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenadas");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
