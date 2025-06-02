package academy.devdojo.arrays;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1 : Digite o " + (i+1) + " número:");
            array1[i] = scanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 2 : Digite o " + (i+1) + " número:");
            array2[i] = scanner.nextInt();
        }
        System.out.println("Multiplicação");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.println(array1[i] + " x " + array2[i] + " = " + array3[i]);
        }
    }
}
