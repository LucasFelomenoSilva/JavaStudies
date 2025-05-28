package academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Lucas";
        final String password = "Lucas123";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelaLogin){
            System.out.println("Digite seu login: ");
            String myLogin = scanner.nextLine();
            System.out.println("Digite sua senha: ");
            String myPassword = scanner.nextLine();
            if (login.equals(myLogin) && password.equals(myPassword)){
                System.out.println("ACESSO CONCEDIDO");
                exibirTelaLogin = false;
                break;
            } else {
                System.out.println("ACESSO NEGADO");
            }

        }
        System.out.println("FIM DO PROGRAMA");
    }
}
