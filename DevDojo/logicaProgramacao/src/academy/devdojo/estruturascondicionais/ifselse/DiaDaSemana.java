package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int dia = input.nextInt();

        if (dia == 1){
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda");
        } else if (dia == 3) {
            System.out.println("Terça");
        } else if (dia == 4) {
            System.out.println("Quarta");
        } else if (dia == 5) {
            System.out.println("Quinta");
        } else if (dia == 6) {
            System.out.println("Sexta");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Opção inválida");
        }
    }
}
