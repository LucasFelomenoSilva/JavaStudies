import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o seu sexo ? M : Masculino; F: Feminino: ");
        String sexo = input.next();
        System.out.println("Qual a sua idade? ");
        int idade = input.nextInt();

        if (sexo.equals("M") && idade >= 18){
            System.out.println("Alistamento obrigatório.");
        } else if ((sexo.equals("M") || sexo.equals("F")) && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo.equals("F") && idade >= 18){
            System.out.println("Alistamento opcional. Deseja se alistar ?");
        } else {
            System.out.println("Opção inválida. Por gentileza, use 'M' ou 'F'.");
        }

    }
}
