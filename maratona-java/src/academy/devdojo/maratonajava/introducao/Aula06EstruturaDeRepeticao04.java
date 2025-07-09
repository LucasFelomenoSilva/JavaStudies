package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double preco = 30000;

        for (int parcela = 1; parcela <= preco ; parcela++) {
            double valorParcela = preco / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
