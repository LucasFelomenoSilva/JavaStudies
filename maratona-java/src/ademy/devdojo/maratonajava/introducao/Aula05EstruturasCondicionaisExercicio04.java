package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio04 {
    public static void main(String[] args) {
        double salario = 45000;
        double imposto;

        if (salario <= 34712){
            imposto = 9.70 / 100;
        } else if (salario <= 68507){
            imposto = 37.35 / 100;
        } else {
            imposto = 49.50 / 100;
        }

        double valorDoImposto = salario * imposto;
        System.out.println("Valor do imposto = " + valorDoImposto);
        System.out.println("Valor total do salário = " + (salario - valorDoImposto));
    }
}
