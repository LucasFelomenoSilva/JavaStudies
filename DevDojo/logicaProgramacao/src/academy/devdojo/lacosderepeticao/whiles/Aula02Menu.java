package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int valorFinal = input.nextInt();
        int i = 0;
        while(i <= valorFinal){
            if(i % 2 != 0){
                System.out.println("I = " + i);
            }
            i = i + 1;
        }
    }
}
