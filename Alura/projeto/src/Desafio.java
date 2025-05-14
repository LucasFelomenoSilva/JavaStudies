import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Lucas";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente:\n");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("\n************************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Tranferência 
                3 - Receber valor
                4 - Sair
                """;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nO saldo atual é R$: " + saldo);
            } else if (opcao == 2 ) {
                System.out.println("\nQual o valor da transferência ? ");
                double transferir = leitura.nextDouble();
                if (transferir > saldo) {
                    System.out.println("\nValor indisponível para transferência.");
                } else {
                    saldo -= transferir;
                    System.out.println("\nTransferência de R$" + transferir + " efetuada com sucesso");
                    System.out.println("O saldo atual é: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nValor recebido: ");
                double receber = leitura.nextDouble();
                saldo =+ receber;
                System.out.println("\nO valor de R$" + receber + " foi recebido com sucesso!");
                System.out.println("O saldo atual é: " + saldo);
            } else if (opcao != 4) {
                System.out.println("\nOpção inválida.");
                System.out.println("Selecione uma das opções abaixo:");
                System.out.println(menu);
            }
        }
    }
}
