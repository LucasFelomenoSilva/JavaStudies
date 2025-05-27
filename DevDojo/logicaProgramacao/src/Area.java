import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.141592654;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o raio do circulo: ");
        double raio = input.nextDouble();
        double area = (raio * raio) * pi;
        System.out.println("A área é: " + area);
    }
}
