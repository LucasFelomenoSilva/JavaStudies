package academy.devdojo.maratonajava.beecrowd;

import java.util.Scanner;

public class Exercicio1051ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        double imposto = 0.0;
;
        if (salary <= 2000.00){
            System.out.println("Isento");
        } else {
            if (salary > 4500.00){
                imposto += (salary - 4500.00) * 0.28;
                salary = 4500.00;
            }
            if (salary > 3000.00){
                imposto += (salary - 3000.00) * 0.18;
                salary = 3000.00;
            }
            if (salary > 2000.00){
                imposto += (salary - 2000.00) * 0.08;
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}
