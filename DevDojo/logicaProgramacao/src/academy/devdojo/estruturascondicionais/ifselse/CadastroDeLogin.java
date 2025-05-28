package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu login: ");
        String nome = input.next();
        if (nome.equals("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")){
            System.out.println("O usuário deve ser diferente de 'admin' ou 'administrador'.");
        } else {
            System.out.println("Usuário " + nome + " cadastrado com sucesso!");
        }
    }
}
