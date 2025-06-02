package academy.devdojo.arrays.unidimensional;

public class Aula01Introducao {
    public static void main(String [] args){
        double nota = 7.5;
        System.out.println();
        double[] notas = new double[4];
        notas[0] = 7.5;
        notas[1] = 8;
        notas[2] = 3;
        notas[3] = 6;
        System.out.println("Tamanho do array: " + notas.length);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}
