public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");
        System.out.println("Filme : Top Gun: Maverick");

        String sinope;
        sinope = """
                Filme Top Gun
                Filme de ação com grande astro dos anos 80.
                """;
        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Média calculada pelas 3 notas.
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);

        int classificacao;
        classificacao = (int) (media / 2);

        System.out.println(classificacao);
    }
}