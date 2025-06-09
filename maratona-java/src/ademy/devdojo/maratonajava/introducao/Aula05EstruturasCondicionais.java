package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args){
        int idade = 17;
        boolean podeCompar = idade >= 18;
        if (podeCompar){
            System.out.println("Pode comprar");
        } else if (!podeCompar){
            System.out.println("Não pode comprar");
        }
    }
}
