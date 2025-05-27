import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tempo gasto da viagem (em horas): ");
        double tempo = input.nextDouble();
        System.out.println("Velocidade média da viagem: ");
        double velocidade = input.nextDouble();

        double distancia = tempo * velocidade;
        double litros = distancia / 12;

        System.out.println("Em uma distancia de " + distancia + " , o consumo é de: " + litros);
    }
}
