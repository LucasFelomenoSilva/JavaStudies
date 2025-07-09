package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero1 = 10;
        int numero2 = 20;
        int resultado = numero1 * numero2;
        System.out.println(resultado);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean izDezMaisQueVinte = 10 > 20;
        boolean izDezMenosQueVinte = 10 < 20;
        boolean izDezIgualVinte = 10 == 20;
        boolean izDezIgualDez = 10 > 10;
        boolean izDezDiferenteDelDez = 10 != 10;
        System.out.println("izDezMaisQueVinte " +izDezMaisQueVinte);
        System.out.println("izDezMenosQueVinte " + izDezMenosQueVinte);
        System.out.println("izDezIgualVinte " + izDezIgualVinte);
        System.out.println("izDezIgualDez " + izDezIgualDez);
        System.out.println("izDezDiferenteDelDez " + izDezDiferenteDelDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 30;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1800;
        bonus -= 1000;
        bonus *= 2;
        System.out.println("bonus " + bonus);

        //
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
    }
}
