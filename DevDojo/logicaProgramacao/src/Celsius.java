import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celsius = ((Fahrenheit - 32) * 5) / 9;
        System.out.println("Temperatura em Celsius: " + Celsius + "º");
    }
}
