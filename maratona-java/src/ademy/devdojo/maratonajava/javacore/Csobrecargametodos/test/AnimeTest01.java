package ademy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import ademy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Dragon Ball", "TV", 12);
        anime.init("Dragon Ball", "TV", 12, "Ação");
        anime.imprime();
    }
}
