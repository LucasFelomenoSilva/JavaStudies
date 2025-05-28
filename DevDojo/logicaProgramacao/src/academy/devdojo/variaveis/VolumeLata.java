package academy.devdojo.variaveis;

import java.util.Scanner;

public class VolumeLata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double PI = 3.141592654;
        System.out.print("Digite o raio da lata (em cm): ");
        double raio = input.nextDouble();

        System.out.print("Digite a altura da lata (em cm): ");
        double altura = input.nextDouble();


        double volume = raio * raio * altura;
        System.out.println(volume);
    }
}

