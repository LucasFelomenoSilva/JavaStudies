package academy.devdojo.variaveis;

public class CalculatorImpost {
    public static void main(String[] args) {
        float salary = 2500.00F;
        float descont = 10;
        float percentageOfSalary = salary * (descont / 100);
        System.out.println("O desconto no salário é de: " + percentageOfSalary);
    }
}
