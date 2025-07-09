package academy.devdojo.maratonajava.javacore.dconstrutores.test;


import academy.devdojo.maratonajava.javacore.dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 12, "Ação", "Toei Animation");
//        Anime anime2 = new Anime();

//        anime.init("Dragon Ball", "TV", 12);
//        anime.init("Dragon Ball", "TV", 12, "Ação");

        anime.imprime();
//        anime2.imprime();
    }
}
