public class ReutilizandoVariaveis {
    public static void main(String[] args) {
        double salary = 5000;
        double result = salary * 0.3;
        System.out.println("Desnconto de 30%: " + result);
        result = salary * 0.15;
        System.out.println("Desnconto de 15%: " + result);
        result = salary * 0.05;
        System.out.println("Desnconto de 5%: " + result);
    }
}
