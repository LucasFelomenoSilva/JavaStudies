package ademy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, chat, byte, short, long, boolean
        int idade = (int) 21000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0;
        float salarioFloat = (float) 2500.0f;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Lucas";

        System.out.println("A idade é " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println("Olá, meu nome é " +nome);
    }
}
