package academy.devdojo.maratonajava.beecrowd;

import java.util.Scanner;

public class Exercicio1040Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        int p1 = 2;
        int p2 = 3;
        int p3 = 4;
        int p4 = 1;

        double media = ((n1 * p1) + (n2 * p2) + (n3 * p3) + (n4 * p4)) / (p1 + p2 + p3 + p4);
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0) {
            System.out.println("Aluno em exame.");
            double exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", exame);
            double mediaFinal = (media + exame) / 2.0;
            if (mediaFinal >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", mediaFinal);
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}