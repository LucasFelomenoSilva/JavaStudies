package academy.devdojo.variaveis;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em academy.devdojo.variaveis.Celsius: ");
        double Celsius = input.nextInt();

        double Fahrenheit = (9 * Celsius) / 5 + 32;
        System.out.println("Graus em academy.devdojo.variaveis.Fahrenheit: " + Fahrenheit);
    }
}
