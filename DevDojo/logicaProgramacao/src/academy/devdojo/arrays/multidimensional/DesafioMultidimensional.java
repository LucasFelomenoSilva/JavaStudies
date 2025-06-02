package academy.devdojo.arrays.multidimensional;

public class DesafioMultidimensional {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 22;
        array[0][1] = 11;
        array[0][2] = 4;
        array[1][0] = 44;
        array[1][1] = 55;
        array[1][2] = 9;
        array[2][0] = 2;
        array[2][1] = 5;
        array[2][2] = 21;
        int resultMultiplicacaoPrincipal = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==j) {
                    resultMultiplicacaoPrincipal = resultMultiplicacaoPrincipal * array[i][j];
                }
            }
        }
        System.out.println(resultMultiplicacaoPrincipal);
    }
}
