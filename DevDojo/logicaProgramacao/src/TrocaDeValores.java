public class TrocaDeValores {
    public static void main(String[] args) {
        String x = "A";
        String y = "B";

        String temp = x;
        x = y;
        y = temp;

        System.out.println("Valor de x: " + x + " | Valor de y: " + y);
    }
}
