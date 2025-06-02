package academy.devdojo.arrays;

import java.util.Scanner;

public class Desafio01Melhorado {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        String resultadoMultiplicacao = "";

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1 : Digite o " + (i + 1) + " número:");
            array1[i] = scanner.nextInt();
            System.out.println("Vetor 2 : Digite o " + (i + 1) + " número:");
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            resultadoMultiplicacao = resultadoMultiplicacao + array3[i];
            System.out.println(array1[i] + " x " + array2[i] + " = " + array3[i] + " ");
        }
        System.out.println(resultadoMultiplicacao);
    }
}
