package academy.devdojo.variaveis;

import java.util.Scanner;

public class SalarioTotal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as horas trabalhadas: ");
        double HT = input.nextInt();
        System.out.println("Digite o valor da hora: R$");
        double VH = input.nextDouble();
        System.out.println("Digite o percentual de desconto: ");
        double PD = input.nextDouble();

        double SB = HT * VH;
        double TD = (PD / 100) * SB;
        double SL = SB - TD;

        System.out.println("--------------------------");
        System.out.println("----------Salário---------");
        System.out.println("Salário base: R$" + SB);
        System.out.println("Horas trabalhadas: R$" + HT);
        System.out.println("Valor hora de trabalho: R$" + VH);
        System.out.println("Total de descontos: R$" + TD);
        System.out.println("Percentual de descontos: " + PD + "%");
        System.out.println("------Salário líquido-----");
        System.out.println("--------R$" +SL + "-------");

    }
}
