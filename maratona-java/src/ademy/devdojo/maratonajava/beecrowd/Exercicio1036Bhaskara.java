package ademy.devdojo.maratonajava.beecrowd;

import java.util.Scanner;

public class Exercicio1036Bhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double delta = (b * b) - 4 * a * c;

        double raizQuadrada = Math.sqrt(delta);

        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        } else {
            double r1 = (-b + raizQuadrada) / (2 * a);
            System.out.printf("R1 = %.5f",r1);
            double r2 = (-b - raizQuadrada) / (2 * a);
            System.out.printf("\nR2 = %.5f",r2);
        }
    }
}
