package ademy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import ademy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest1");
        calculadora.subtraiDoisNumeros();
    }
}
