package academy.devdojo.variaveis;

import java.util.Scanner;

public class Prestacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor da prestação? ");
        double valor = input.nextDouble();
        System.out.println("Qual a taxa para atraso? ");
        double taxa = input.nextDouble();
        System.out.println("Qual o tempo de atraso? Em dias");
        double tempo = input.nextDouble();

        double prestacao = valor + (valor * (taxa / 100) * tempo);
        System.out.println("Valor da prestação em atraso: " + prestacao);
    }
}
