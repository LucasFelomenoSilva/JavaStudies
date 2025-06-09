package ademy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 15;
        if (idade < 15){
            System.out.println("Infantil");
        } else if (idade >= 15 && idade < 18){
            System.out.println("Juvenil");
        } else {
            System.out.println("Adulto");
        }
    }
}
