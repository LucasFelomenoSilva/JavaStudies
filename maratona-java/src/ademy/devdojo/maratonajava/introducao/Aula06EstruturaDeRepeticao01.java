package ademy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count < 10){
            count++;
            System.out.println("While: " + count);
        }
        do{
            count++;
            System.out.println("dentro do do-while");
        }while (count < 10);

        System.out.println("---------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println("For: " + i);
        }
    }
    
}
