package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class ToneioDeNatacao {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = input.next();
        System.out.println("Digite a sua idade: ");
        int age = input.nextInt();
        if (age < 11){
            System.out.println(name + " participará da categoria Infantil");
        } else if (age < 16) {
            System.out.println(name + " participará da categoria Juvenil");
        } else if (age < 20) {
            System.out.println(name + " participará da categoria Pré-adulto");
        } else {
            System.out.println(name + " participará da categoria Adulto");
        }
    }
}
